import java.util.Scanner;

/**
 * Program: JavaArraysPracticeSuite
 * Purpose: Consolidating 1D and 2D Array concepts into one executable program.
 * Following Best Programming Practices: Variable naming and documentation.
 */
public class JavaArraysPracticeSuite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java Arrays Concept Menu ---");
            System.out.println("1. 1D Array: Define and Access Elements");
            System.out.println("2. 1D Array: Calculate Sum of Elements");
            System.out.println("3. 2D Array: Display 3x3 Matrix and Sum");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Concept: Creating and accessing a 1D Array
                    int[] ages = {24, 23, 18, 19, 20};
                    System.out.println("Displaying 1D Array elements using indices:");
                    for (int i = 0; i < ages.length; i++) {
                        System.out.println("Index " + i + ": " + ages[i]);
                    }
                    break;

                case 2:
                    // Concept: Sum of elements in a 1D Array
                    System.out.print("How many elements do you want to enter? ");
                    int size = input.nextInt();
                    int[] numbers = new int[size];
                    int sum1D = 0;

                    System.out.println("Enter " + size + " integers:");
                    for (int i = 0; i < size; i++) {
                        numbers[i] = input.nextInt();
                        sum1D += numbers[i];
                    }
                    System.out.println("The sum of elements in the 1D array is: " + sum1D);
                    break;

                case 3:
                    // Concept: 2D Array (Matrix) Operations
                    // Following the example from Page 7 of the document
                    int[][] matrix = new int[3][3];
                    int totalSum = 0;

                    System.out.println("Enter elements for a 3x3 matrix:");
                    for (int row = 0; row < 3; row++) {
                        for (int col = 0; col < 3; col++) {
                            System.out.print("Element [" + row + "][" + col + "]: ");
                            matrix[row][col] = input.nextInt();
                        }
                    }

                    System.out.println("\nThe 2D Matrix is:");
                    for (int row = 0; row < 3; row++) {
                        for (int col = 0; col < 3; col++) {
                            System.out.print(matrix[row][col] + "\t");
                            totalSum += matrix[row][col];
                        }
                        System.out.println(); // New line after each row
                    }
                    System.out.println("Sum of all elements in the matrix: " + totalSum);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        input.close();
    }
}