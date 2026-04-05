import java.util.Scanner;

/**
 * Program: Level2PracticeSuite
 * Purpose: A single consolidated class for all Level 2 Lab Practice programs.
 * Follows Best Programming Practices: Variable naming, comments, and structure.
 */
public class Level2PracticeSuite {

    public static void main(String[] args) {
        // Create a Scanner Object for user input [cite: 213, 253]
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java Control Flow Level 2 Menu ---");
            System.out.println("1. Print Odd and Even (1 to N)");
            System.out.println("2. Calculate Employee Bonus");
            System.out.println("3. Multiplication Table (6 to 9)");
            System.out.println("4. FizzBuzz (For Loop)");
            System.out.println("5. FizzBuzz (While Loop)");
            System.out.println("6. Youngest Friend & Tallest Friend");
            System.out.println("7. Find Factors (For Loop)");
            System.out.println("8. Find Factors (While Loop)");
            System.out.println("9. Greatest Factor (For Loop)");
            System.out.println("10. Greatest Factor (While Loop)");
            System.out.println("11. Multiples below 100 (For Loop)");
            System.out.println("12. Power of a Number (For Loop)");
            System.out.println("13. Multiples below 100 (While Loop)");
            System.out.println("14. Power of a Number (While Loop)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Odd and Even between 1 to N [cite: 281]
                    System.out.print("Enter a natural number: ");
                    int n1 = input.nextInt();
                    if (n1 > 0) { // Check for Natural Number [cite: 283]
                        for (int i = 1; i <= n1; i++) { // [cite: 284]
                            if (i % 2 == 0) System.out.println(i + " is Even");
                            else System.out.println(i + " is Odd"); // [cite: 285]
                        }
                    }
                    break;

                case 2: // Employee Bonus [cite: 286]
                    System.out.print("Enter salary: ");
                    double salary = input.nextDouble();
                    System.out.print("Enter years of service: ");
                    int years = input.nextInt(); // [cite: 288]
                    if (years > 5) { // Zara gives 5% bonus for > 5 years [cite: 287]
                        double bonus = salary * 0.05;
                        System.out.println("Bonus Amount: " + bonus); // [cite: 289]
                    } else {
                        System.out.println("No bonus for service <= 5 years.");
                    }
                    break;

                case 3: // Multiplication Table 6 to 9 [cite: 290]
                    System.out.print("Enter number: ");
                    int n3 = input.nextInt();
                    for (int i = 6; i <= 9; i++) { // Find table from 6 to 9 [cite: 293]
                        System.out.println(n3 + " * " + i + " = " + (n3 * i));
                    }
                    break;

                case 4: // FizzBuzz For Loop [cite: 294]
                    System.out.print("Enter positive integer: ");
                    int fbLimit = input.nextInt();
                    if (fbLimit > 0) {
                        for (int i = 1; i <= fbLimit; i++) {
                            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
                            else if (i % 3 == 0) System.out.println("Fizz");
                            else if (i % 5 == 0) System.out.println("Buzz");
                            else System.out.println(i); // 
                        }
                    }
                    break;

                case 5: // FizzBuzz While Loop [cite: 298]
                    System.out.print("Enter positive integer: ");
                    int fbLimitW = input.nextInt();
                    int fbCounter = 1;
                    while (fbCounter <= fbLimitW) {
                        if (fbCounter % 3 == 0 && fbCounter % 5 == 0) System.out.println("FizzBuzz");
                        else if (fbCounter % 3 == 0) System.out.println("Fizz");
                        else if (fbCounter % 5 == 0) System.out.println("Buzz");
                        else System.out.println(fbCounter);
                        fbCounter++;
                    }
                    break;

                case 6: // Youngest and Tallest friend [cite: 299]
                    // Variables for Amar, Akbar, Anthony [cite: 301]
                    int ageAmar, ageAkbar, ageAnthony;
                    double hAmar, hAkbar, hAnthony;
                    System.out.print("Enter Age and Height for Amar: ");
                    ageAmar = input.nextInt(); hAmar = input.nextDouble();
                    System.out.print("Enter Age and Height for Akbar: ");
                    ageAkbar = input.nextInt(); hAkbar = input.nextDouble();
                    System.out.print("Enter Age and Height for Anthony: ");
                    ageAnthony = input.nextInt(); hAnthony = input.nextDouble();

                    // Finding Youngest (Smallest Age) [cite: 302]
                    int youngest = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
                    System.out.println("Youngest Age: " + youngest);

                    // Finding Tallest (Largest Height) [cite: 303]
                    double tallest = Math.max(hAmar, Math.max(hAkbar, hAnthony));
                    System.out.println("Tallest Height: " + tallest);
                    break;

                case 7: // Factors For Loop [cite: 304]
                    System.out.print("Enter positive integer: ");
                    int factNum = input.nextInt();
                    if (factNum > 0) {
                        for (int i = 1; i < factNum; i++) { // 
                            if (factNum % i == 0) System.out.println("Factor: " + i); // [cite: 307, 308]
                        }
                    }
                    break;

                case 8: // Factors While Loop [cite: 311]
                    System.out.print("Enter positive integer: ");
                    int factNumW = input.nextInt();
                    int fCounter = 1; // [cite: 313]
                    while (fCounter < factNumW) {
                        if (factNumW % fCounter == 0) System.out.println("Factor: " + fCounter); // [cite: 314, 315]
                        fCounter++;
                    }
                    break;

                case 9: // Greatest Factor For Loop [cite: 316]
                    System.out.print("Enter integer: ");
                    int gfNum = input.nextInt();
                    int greatestFactor = 1; // [cite: 318]
                    for (int i = gfNum - 1; i >= 1; i--) { // Loop backward 
                        if (gfNum % i == 0) {
                            greatestFactor = i;
                            break; // 
                        }
                    }
                    System.out.println("Greatest Factor: " + greatestFactor); // [cite: 321]
                    break;

                case 10: // Greatest Factor While Loop [cite: 322]
                    System.out.print("Enter integer: ");
                    int gfNumW = input.nextInt();
                    int gfW = 1;
                    int gfCounter = gfNumW - 1; // [cite: 326]
                    while (gfCounter >= 1) { // [cite: 327]
                        if (gfNumW % gfCounter == 0) {
                            gfW = gfCounter;
                            break; // [cite: 328]
                        }
                        gfCounter--;
                    }
                    System.out.println("Greatest Factor: " + gfW); // [cite: 329]
                    break;

                case 11: // Multiples of number below 100 For [cite: 330]
                    System.out.print("Enter number: ");
                    int mNum = input.nextInt();
                    if (mNum > 0 && mNum < 100) { // [cite: 332]
                        for (int i = 100; i >= 1; i--) { // Backward loop [cite: 333]
                            if (i % mNum == 0) System.out.println("Multiple: " + i);
                        }
                    }
                    break;

                case 12: // Power of a number For [cite: 335]
                    System.out.print("Enter base and power: ");
                    int base = input.nextInt(), pwr = input.nextInt();
                    long res = 1; // [cite: 338]
                    for (int i = 1; i <= pwr; i++) { // [cite: 339]
                        res *= base; // [cite: 340]
                    }
                    System.out.println("Result: " + res); // [cite: 341]
                    break;

                case 13: // Multiples below 100 While [cite: 345]
                    System.out.print("Enter number: ");
                    int mwNum = input.nextInt();
                    int mwCounter = 99; 
                    while (mwCounter >= 1) {
                        if (mwCounter % mwNum == 0) System.out.println("Multiple: " + mwCounter);
                        mwCounter--;
                    }
                    break;

                case 14: // Power While Loop [cite: 352]
                    System.out.print("Enter base and power: ");
                    int baseW = input.nextInt(), pwrW = input.nextInt();
                    long resW = 1;
                    int pCounter = 0; // [cite: 355]
                    while (pCounter < pwrW) {
                        resW *= baseW; // [cite: 356]
                        pCounter++; // [cite: 357]
                    }
                    System.out.println("Result: " + resW); // [cite: 358]
                    break;

                case 0:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid input. Try again.");
            }
        } while (choice != 0);

        input.close(); // [cite: 238]
    }
}