import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input [cite: 374]
        Scanner input = new Scanner(System.in);

        // Define variables for inputs and results [cite: 369, 445]
        double number1, number2;
        double addition, subtraction, multiplication, division;

        // Take user inputs [cite: 445, 447]
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        // Perform Arithmetic Operations 
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;

        // Display results in a single print statement [cite: 446, 450]
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + 
                           number1 + " and " + number2 + " is: \n" +
                           "Addition: " + addition + "\n" +
                           "Subtraction: " + subtraction + "\n" +
                           "Multiplication: " + multiplication + "\n" +
                           "Division: " + division);

        input.close();
    }
}