import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number to analyze: ");
        int originalNumber = input.nextInt();
        
        int number = originalNumber;
        int sumOfDigits = 0;

        // 1. Using a While Loop to process digits (Sample Program 2 logic)
        // This loop continues as long as number is not 0
        while (number != 0) {
            // Use modulo (%) to get the last digit
            int digit = number % 10;
            
            // Add the digit to our running total
            sumOfDigits += digit;
            
            // Use division (/) to remove the last digit
            number = number / 10;
        }

        // 2. Using Conditional Statements (if-else) to categorize the sum
        System.out.println("\n--- Analysis Results ---");
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Sum of Digits: " + sumOfDigits);

        // Check if the sum is even or odd using a comparison operator
        if (sumOfDigits % 2 == 0) {
            System.out.println("The sum of the digits is an EVEN number.");
        } else {
            System.out.println("The sum of the digits is an ODD number.");
        }

        // Close the scanner resource
        input.close();
    }
}