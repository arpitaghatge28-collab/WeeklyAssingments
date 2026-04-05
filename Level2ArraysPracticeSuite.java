import java.util.Scanner;

/**
 * Program: Level2ArraysPracticeSuite
 * Purpose: A single consolidated class for all Level 2 Array Lab Practice programs.
 * Covers: Largest/Smallest, Reversing, Frequency counting, and 2D student marks.
 */
public class Level2ArraysPracticeSuite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java Arrays Level 2 Menu ---");
            System.out.println("1. Find Largest, Second Largest, Smallest & Second Smallest");
            System.out.println("2. Display Digits of a Number and their Frequency");
            System.out.println("3. Reverse an Array");
            System.out.println("4. BMI Calculator for a Group (using Arrays)");
            System.out.println("5. Student Grade Calculator (2D Array for Marks)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Largest and Smallest logic
                    System.out.print("Enter a 10-digit number: ");
                    long bigNum = input.nextLong();
                    int[] digits = new int[10];
                    for (int i = 9; i >= 0; i--) {
                        digits[i] = (int)(bigNum % 10);
                        bigNum /= 10;
                    }
                    
                    int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
                    int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

                    for (int d : digits) {
                        // Find Largest and Second Largest
                        if (d > largest) {
                            secondLargest = largest;
                            largest = d;
                        } else if (d > secondLargest && d != largest) {
                            secondLargest = d;
                        }
                        // Find Smallest and Second Smallest
                        if (d < smallest) {
                            secondSmallest = smallest;
                            smallest = d;
                        } else if (d < secondSmallest && d != smallest) {
                            secondSmallest = d;
                        }
                    }
                    System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
                    System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
                    break;

                case 2: // Frequency of digits
                    System.out.print("Enter a number: ");
                    long num2 = input.nextLong();
                    int[] freq = new int[10]; // Indices 0-9 represent digits
                    while (num2 > 0) {
                        int lastDigit = (int)(num2 % 10);
                        freq[lastDigit]++;
                        num2 /= 10;
                    }
                    System.out.println("Digit Frequency:");
                    for (int i = 0; i < 10; i++) {
                        if (freq[i] > 0) System.out.println(i + " occurs " + freq[i] + " times.");
                    }
                    break;

                case 3: // Reverse an Array
                    System.out.print("Enter number of elements: ");
                    int n3 = input.nextInt();
                    int[] original = new int[n3];
                    int[] reversed = new int[n3];
                    System.out.println("Enter " + n3 + " numbers:");
                    for (int i = 0; i < n3; i++) original[i] = input.nextInt();
                    
                    for (int i = 0; i < n3; i++) {
                        reversed[i] = original[n3 - 1 - i];
                    }
                    System.out.print("Reversed Array: ");
                    for (int val : reversed) System.out.print(val + " ");
                    System.out.println();
                    break;

                case 4: // BMI Group Calculator
                    System.out.print("Enter number of persons: ");
                    int persons = input.nextInt();
                    double[][] data = new double[persons][3]; // [weight, height, bmi]
                    String[] status = new String[persons];

                    for (int i = 0; i < persons; i++) {
                        System.out.print("Enter weight (kg) and height (cm) for person " + (i+1) + ": ");
                        data[i][0] = input.nextDouble();
                        data[i][1] = input.nextDouble() / 100.0; // cm to m
                        data[i][2] = data[i][0] / (data[i][1] * data[i][1]); // BMI Formula

                        if (data[i][2] <= 18.4) status[i] = "Underweight";
                        else if (data[i][2] <= 24.9) status[i] = "Normal";
                        else if (data[i][2] <= 39.9) status[i] = "Overweight";
                        else status[i] = "Obese";
                    }
                    for (int i = 0; i < persons; i++) {
                        System.out.printf("Person %d: BMI %.2f (%s)\n", (i+1), data[i][2], status[i]);
                    }
                    break;

                case 5: // Student Grade 2D Array
                    System.out.print("Enter number of students: ");
                    int numStudents = input.nextInt();
                    // Col 0: Physics, Col 1: Chemistry, Col 2: Maths
                    int[][] marks = new int[numStudents][3];
                    double[] per = new double[numStudents];
                    char[] grades = new char[numStudents];

                    for (int i = 0; i < numStudents; i++) {
                        System.out.print("Enter marks for Physics, Chemistry, Maths for student " + (i+1) + ": ");
                        for (int j = 0; j < 3; j++) {
                            marks[i][j] = input.nextInt();
                            if (marks[i][j] < 0) {
                                System.out.println("Enter positive values!");
                                j--; // Re-take input for same subject
                            }
                        }
                        per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
                        if (per[i] >= 80) grades[i] = 'A';
                        else if (per[i] >= 70) grades[i] = 'B';
                        else if (per[i] >= 60) grades[i] = 'C';
                        else if (per[i] >= 50) grades[i] = 'D';
                        else if (per[i] >= 40) grades[i] = 'E';
                        else grades[i] = 'R';
                    }
                    System.out.println("\nResults:");
                    for (int i = 0; i < numStudents; i++) {
                        System.out.printf("Student %d: Avg %.2f%% Grade: %c\n", (i+1), per[i], grades[i]);
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