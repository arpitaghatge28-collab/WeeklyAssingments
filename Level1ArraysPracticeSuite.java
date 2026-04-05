import java.util.Scanner;

/**
 * Program: Level1ArraysPracticeSuite
 * Purpose: A single consolidated class for all Level 1 Array Lab Practice programs.
 * Follows Best Programming Practices: Variable naming, comments, and structure.
 */
public class Level1ArraysPracticeSuite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java Arrays Level 1 Menu ---");
            System.out.println("1. Sum of Digits of a Number (using Array)");
            System.out.println("2. Store and Display Multiples of a Number");
            System.out.println("3. Store 10 Numbers and Find Positives/Negatives/Even/Odd");
            System.out.println("4. Student Grade Calculator (Physics, Chemistry, Maths)");
            System.out.println("5. Factor Finder (with Dynamic Array resizing)");
            System.out.println("6. Copy 2D Array to 1D Array");
            System.out.println("7. FizzBuzz Array Storage");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Sum of Digits using Array
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    if (num1 <= 0) {
                        System.out.println("Invalid Number.");
                    } else {
                        String temp = Integer.toString(num1);
                        int[] digits = new int[temp.length()];
                        int sum1 = 0, n1 = num1;
                        for (int i = digits.length - 1; i >= 0; i--) {
                            digits[i] = n1 % 10;
                            sum1 += digits[i];
                            n1 /= 10;
                        }
                        System.out.println("Sum of digits: " + sum1);
                    }
                    break;

                case 2: // Multiples of a Number
                    System.out.print("Enter number: ");
                    int base = input.nextInt();
                    int[] multiples = new int[10];
                    for (int i = 0; i < 10; i++) {
                        multiples[i] = base * (i + 1);
                        System.out.println(base + " * " + (i + 1) + " = " + multiples[i]);
                    }
                    break;

                case 3: // Positives/Negatives/Even/Odd
                    int[] arr3 = new int[10];
                    System.out.println("Enter 10 numbers:");
                    for (int i = 0; i < 10; i++) arr3[i] = input.nextInt();
                    for (int n : arr3) {
                        if (n > 0) System.out.print(n + " is Positive, ");
                        else if (n < 0) System.out.print(n + " is Negative, ");
                        else System.out.print(n + " is Zero, ");
                        
                        if (n % 2 == 0) System.out.println("Even");
                        else System.out.println("Odd");
                    }
                    break;

                case 4: // Student Grade Calculator
                    System.out.print("Enter number of students: ");
                    int students = input.nextInt();
                    double[] percentages = new double[students];
                    String[] grades = new String[students];

                    for (int i = 0; i < students; i++) {
                        System.out.print("Enter marks for Physics, Chemistry, Maths for Student " + (i + 1) + ": ");
                        int p = input.nextInt(), c = input.nextInt(), m = input.nextInt();
                        percentages[i] = (p + c + m) / 3.0;
                        if (percentages[i] >= 80) grades[i] = "A";
                        else if (percentages[i] >= 70) grades[i] = "B";
                        else if (percentages[i] >= 60) grades[i] = "C";
                        else if (percentages[i] >= 50) grades[i] = "D";
                        else if (percentages[i] >= 40) grades[i] = "E";
                        else grades[i] = "R";
                    }
                    for (int i = 0; i < students; i++) {
                        System.out.println("Student " + (i+1) + " Percentage: " + percentages[i] + " Grade: " + grades[i]);
                    }
                    break;

                case 5: // Factor Finder with dynamic-like resizing
                    System.out.print("Enter number: ");
                    int num5 = input.nextInt();
                    int maxIndex = 10;
                    int[] factors = new int[maxIndex];
                    int index = 0;
                    for (int i = 1; i <= num5; i++) {
                        if (num5 % i == 0) {
                            if (index == maxIndex) {
                                maxIndex *= 2;
                                int[] tempArr = new int[maxIndex];
                                System.arraycopy(factors, 0, tempArr, 0, factors.length);
                                factors = tempArr;
                            }
                            factors[index++] = i;
                        }
                    }
                    System.out.print("Factors: ");
                    for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");
                    System.out.println();
                    break;

                case 6: // 2D to 1D Array Copy
                    System.out.print("Enter rows and cols: ");
                    int r = input.nextInt(), cols = input.nextInt();
                    int[][] matrix = new int[r][cols];
                    int[] flat = new int[r * cols];
                    int flatIdx = 0;
                    System.out.println("Enter matrix elements:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < cols; j++) {
                            matrix[i][j] = input.nextInt();
                            flat[flatIdx++] = matrix[i][j];
                        }
                    }
                    System.out.print("1D Array: ");
                    for (int val : flat) System.out.print(val + " ");
                    System.out.println();
                    break;

                case 7: // FizzBuzz Array
                    System.out.print("Enter positive number: ");
                    int fbNum = input.nextInt();
                    if (fbNum <= 0) break;
                    String[] fbResults = new String[fbNum + 1];
                    for (int i = 0; i <= fbNum; i++) {
                        if (i == 0) fbResults[i] = "0";
                        else if (i % 15 == 0) fbResults[i] = "FizzBuzz";
                        else if (i % 3 == 0) fbResults[i] = "Fizz";
                        else if (i % 5 == 0) fbResults[i] = "Buzz";
                        else fbResults[i] = String.valueOf(i);
                    }
                    for (int i = 0; i <= fbNum; i++) {
                        System.out.println("Position " + i + " = " + fbResults[i]);
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 0);
        input.close();
    }
}