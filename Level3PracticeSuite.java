import java.util.Scanner;

/**
 * Program: Level3PracticeSuite
 * Purpose: A single consolidated class for all Level 3 Lab Practice programs.
 * Follows Best Programming Practices: Variable naming, comments, and structure.
 */
public class Level3PracticeSuite {

    public static void main(String[] args) {
        // Create a Scanner Object for user input [cite: 382, 383]
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java Control Flow Level 3 Menu ---");
            System.out.println("1. Leap Year Checker (Multiple If-Else)");
            System.out.println("2. Leap Year Checker (Single If with Logical Operators)");
            System.out.println("3. Grade Calculator (Physics, Chemistry, Maths)");
            System.out.println("4. Prime Number Checker");
            System.out.println("5. Armstrong Number Checker");
            System.out.println("6. Count Digits in an Integer");
            System.out.println("7. BMI Calculator");
            System.out.println("8. Harshad Number Checker");
            System.out.println("9. Abundant Number Checker");
            System.out.println("10. Calculator (Switch Case)");
            System.out.println("11. Day of the Week Finder");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Leap Year - Multiple If-Else [cite: 451, 457]
                    System.out.print("Enter year (>= 1582): ");
                    int year1 = input.nextInt();
                    if (year1 >= 1582) {
                        if (year1 % 400 == 0) System.out.println("Leap Year");
                        else if (year1 % 100 == 0) System.out.println("Not a Leap Year");
                        else if (year1 % 4 == 0) System.out.println("Leap Year");
                        else System.out.println("Not a Leap Year");
                    } else {
                        System.out.println("Year must be 1582 or later.");
                    }
                    break;

                case 2: // Leap Year - Single If [cite: 458]
                    System.out.print("Enter year (>= 1582): ");
                    int year2 = input.nextInt();
                    if (year2 >= 1582 && ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))) {
                        System.out.println("Leap Year");
                    } else if (year2 >= 1582) {
                        System.out.println("Not a Leap Year");
                    }
                    break;

                case 3: // Grade Calculator [cite: 459, 460]
                    System.out.print("Enter marks for Physics, Chemistry, Maths: ");
                    int p = input.nextInt(), c = input.nextInt(), m = input.nextInt();
                    double avg = (p + c + m) / 3.0;
                    System.out.println("Average Mark: " + avg);
                    if (avg >= 80) System.out.println("Grade: A (Level 4)");
                    else if (avg >= 70) System.out.println("Grade: B (Level 3)");
                    else if (avg >= 60) System.out.println("Grade: C (Level 2)");
                    else if (avg >= 50) System.out.println("Grade: D (Level 1)");
                    else if (avg >= 40) System.out.println("Grade: E (Level 1-)");
                    else System.out.println("Grade: R (Remedial)");
                    break;

                case 4: // Prime Number Checker [cite: 464, 468, 470]
                    System.out.print("Enter number: ");
                    int primeNum = input.nextInt();
                    boolean isPrime = primeNum > 1;
                    for (int i = 2; i <= Math.sqrt(primeNum); i++) {
                        if (primeNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(primeNum + " is Prime? " + isPrime);
                    break;

                case 5: // Armstrong Number [cite: 475, 478, 482]
                    System.out.print("Enter number: ");
                    int armNum = input.nextInt();
                    int tempArm = armNum, armSum = 0;
                    while (tempArm != 0) {
                        int digit = tempArm % 10;
                        armSum += Math.pow(digit, 3);
                        tempArm /= 10;
                    }
                    if (armSum == armNum) System.out.println("Armstrong Number");
                    else System.out.println("Not an Armstrong Number");
                    break;

                case 6: // Count Digits [cite: 487, 490, 492]
                    System.out.print("Enter number: ");
                    int countNum = Math.abs(input.nextInt());
                    int count = (countNum == 0) ? 1 : 0;
                    while (countNum > 0) {
                        countNum /= 10;
                        count++;
                    }
                    System.out.println("Number of digits: " + count);
                    break;

                case 7: // BMI Calculator [cite: 494, 497, 499]
                    System.out.print("Enter weight (kg) and height (cm): ");
                    double weight = input.nextDouble(), heightCm = input.nextDouble();
                    double heightM = heightCm / 100.0;
                    double bmi = weight / (heightM * heightM);
                    System.out.println("BMI: " + bmi);
                    if (bmi <= 18.4) System.out.println("Status: Underweight");
                    else if (bmi <= 24.9) System.out.println("Status: Normal");
                    else if (bmi <= 39.9) System.out.println("Status: Overweight");
                    else System.out.println("Status: Obese");
                    break;

                case 8: // Harshad Number [cite: 502, 503, 511]
                    System.out.print("Enter number: ");
                    int hNum = input.nextInt();
                    int tempH = hNum, hSum = 0;
                    while (tempH != 0) {
                        hSum += tempH % 10;
                        tempH /= 10;
                    }
                    if (hNum % hSum == 0) System.out.println("Harshad Number");
                    else System.out.println("Not a Harshad Number");
                    break;

                case 9: // Abundant Number [cite: 513, 515, 527]
                    System.out.print("Enter number: ");
                    int abNum = input.nextInt();
                    int abSum = 0;
                    for (int i = 1; i < abNum; i++) {
                        if (abNum % i == 0) abSum += i;
                    }
                    if (abSum > abNum) System.out.println("Abundant Number");
                    else System.out.println("Not an Abundant Number");
                    break;

                case 10: // Calculator [cite: 529, 531, 535]
                    System.out.print("Enter first number, operator (+,-,*,/), second number: ");
                    double first = input.nextDouble();
                    String op = input.next();
                    double second = input.nextDouble();
                    switch (op) {
                        case "+": System.out.println("Result: " + (first + second)); break;
                        case "-": System.out.println("Result: " + (first - second)); break;
                        case "*": System.out.println("Result: " + (first * second)); break;
                        case "/": System.out.println("Result: " + (first / second)); break;
                        default: System.out.println("Invalid Operator");
                    }
                    break;

                case 11: // Day of the Week [cite: 543, 547, 549]
                    System.out.print("Enter month, day, year: ");
                    int m11 = input.nextInt(), d11 = input.nextInt(), y11 = input.nextInt();
                    int y0 = y11 - (14 - m11) / 12;
                    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
                    int m0 = m11 + 12 * ((14 - m11) / 12) - 2;
                    int d0 = (d11 + x + 31 * m0 / 12) % 7;
                    System.out.println("Day of the week: " + d0 + " (0=Sun, 1=Mon, ...)");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        input.close();
    }
}