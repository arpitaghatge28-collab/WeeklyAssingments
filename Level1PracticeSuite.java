import java.util.Scanner;

/**
 * Program: Level1PracticeSuite
 * Purpose: Consolidating all Level 1 Lab Practice programs into one class.
 * Following Best Programming Practices: Variable naming, indentation, and comments.
 */
public class Level1PracticeSuite {

    public static void main(String[] args) {
        // Create a Scanner Object [cite: 24]
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Display Menu based on Practice Programs [cite: 91]
            System.out.println("\n--- Level 1 Practice Menu ---");
            System.out.println("1. Check Divisibility by 5");
            System.out.println("2. Check Smallest of 3 Numbers");
            System.out.println("3. Check Largest of 3 Numbers");
            System.out.println("4. Sum of N Natural Numbers (Formula)");
            System.out.println("5. Voting Eligibility");
            System.out.println("6. Positive, Negative, or Zero");
            System.out.println("7. Spring Season Checker");
            System.out.println("8. Rocket Launch (While Loop)");
            System.out.println("9. Rocket Launch (For Loop)");
            System.out.println("10. Sum until User enters 0");
            System.out.println("11. Sum until 0 or Negative (Break)");
            System.out.println("12. Compare Sum of N (While vs Formula)");
            System.out.println("13. Compare Sum of N (For vs Formula)");
            System.out.println("14. Factorial (While Loop)");
            System.out.println("15. Factorial (For Loop)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Divisibility by 5 [cite: 92]
                    System.out.print("Enter number: ");
                    int divNum = input.nextInt();
                    System.out.println("Is " + divNum + " divisible by 5? " + (divNum % 5 == 0));
                    break;

                case 2: // Smallest of 3 [cite: 95]
                    System.out.print("Enter three numbers: ");
                    int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();
                    boolean isFirstSmallest = (n1 < n2 && n1 < n3);
                    System.out.println("Is the first number the smallest? " + isFirstSmallest);
                    break;

                case 3: // Largest of 3 [cite: 98]
                    System.out.print("Enter three numbers: ");
                    int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();
                    System.out.println("Is first largest? " + (x > y && x > z));
                    System.out.println("Is second largest? " + (y > x && y > z));
                    System.out.println("Is third largest? " + (z > x && z > y));
                    break;

                case 4: // Natural Number Sum via Formula [cite: 104, 107]
                    System.out.print("Enter number: ");
                    int natNum = input.nextInt();
                    if (natNum > 0) {
                        int formulaSum = natNum * (natNum + 1) / 2;
                        System.out.println("The sum of " + natNum + " natural numbers is " + formulaSum);
                    } else {
                        System.out.println("The number " + natNum + " is not a natural number.");
                    }
                    break;

                case 5: // Voting Eligibility [cite: 116, 119]
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    if (age >= 18) {
                        System.out.println("The person's age is " + age + " and can vote.");
                    } else {
                        System.out.println("The person's age is " + age + " and cannot vote.");
                    }
                    break;

                case 6: // Positive, Negative, or Zero [cite: 135]
                    System.out.print("Enter number: ");
                    int checkNum = input.nextInt();
                    if (checkNum > 0) System.out.println("positive");
                    else if (checkNum < 0) System.out.println("negative");
                    else System.out.println("zero");
                    break;

                case 7: // Spring Season [cite: 143, 146]
                    System.out.print("Enter month and day: ");
                    int m = input.nextInt(), d = input.nextInt();
                    if ((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || 
                        (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20)) {
                        System.out.println("Its a Spring Season");
                    } else {
                        System.out.println("Not a Spring Season");
                    }
                    break;

                case 8: // Rocket Launch While [cite: 147, 150]
                    System.out.print("Enter countdown start: ");
                    int counterW = input.nextInt();
                    while (counterW >= 1) {
                        System.out.println(counterW--);
                    }
                    break;

                case 9: // Rocket Launch For [cite: 152]
                    System.out.print("Enter countdown start: ");
                    int counterF = input.nextInt();
                    for (int i = counterF; i >= 1; i--) {
                        System.out.println(i);
                    }
                    break;

                case 10: // Sum until 0 [cite: 153, 155, 157]
                    double total10 = 0.0;
                    double entry10;
                    do {
                        System.out.print("Enter number (0 to stop): ");
                        entry10 = input.nextDouble();
                        total10 += entry10;
                    } while (entry10 != 0);
                    System.out.println("Total value: " + total10);
                    break;

                case 11: // Sum until 0 or negative [cite: 160, 162, 163]
                    double total11 = 0.0;
                    while (true) {
                        System.out.print("Enter number (0 or neg to stop): ");
                        double entry11 = input.nextDouble();
                        if (entry11 <= 0) break;
                        total11 += entry11;
                    }
                    System.out.println("Total value: " + total11);
                    break;

                case 12: // Compare Sum While vs Formula [cite: 164, 167]
                    System.out.print("Enter natural number: ");
                    int n12 = input.nextInt();
                    if (n12 > 0) {
                        int sumW = 0, i = 1;
                        while (i <= n12) sumW += i++;
                        int formula12 = n12 * (n12 + 1) / 2;
                        System.out.println("While: " + sumW + ", Formula: " + formula12);
                        System.out.println("Both match: " + (sumW == formula12));
                    }
                    break;

                case 13: // Compare Sum For vs Formula [cite: 173, 177]
                    System.out.print("Enter natural number: ");
                    int n13 = input.nextInt();
                    if (n13 > 0) {
                        int sumF = 0;
                        for (int i = 1; i <= n13; i++) sumF += i;
                        int formula13 = n13 * (n13 + 1) / 2;
                        System.out.println("For: " + sumF + ", Formula: " + formula13);
                        System.out.println("Both match: " + (sumF == formula13));
                    }
                    break;

                case 14: // Factorial While [cite: 179, 184]
                    System.out.print("Enter positive integer: ");
                    int f14 = input.nextInt();
                    if (f14 >= 0) {
                        long factW = 1;
                        int i = 1;
                        while (i <= f14) factW *= i++;
                        System.out.println("Factorial: " + factW);
                    }
                    break;

                case 15: // Factorial For [cite: 186, 188]
                    System.out.print("Enter positive integer: ");
                    int f15 = input.nextInt();
                    if (f15 >= 0) {
                        long factF = 1;
                        for (int i = 1; i <= f15; i++) factF *= i;
                        System.out.println("Factorial: " + factF);
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 0);

        // Closing the Scanner Stream [cite: 48, 83]
        input.close();
    }
}
