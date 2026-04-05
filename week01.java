import java.util.Scanner;

public class TravelCalculator {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);

        // 1. Variable Declaration & Naming (Best Practice)
        String travelerName;
        double distancePart1, distancePart2;
        int hours, minutes;

        // 2. Taking User Input
        System.out.print("Enter Traveler Name: ");
        travelerName = input.nextLine();

        System.out.print("Enter distance for Leg 1 (km): ");
        distancePart1 = input.nextDouble();

        System.out.print("Enter distance for Leg 2 (km): ");
        distancePart2 = input.nextDouble();

        // 3. Arithmetic Operations
        double totalDistance = distancePart1 + distancePart2;

        // 4. Using Type Conversion & Math
        // Example: Converting 4 hours and 25 minutes into total minutes
        hours = 4;
        minutes = 25;
        int totalMinutes = (hours * 60) + minutes; 

        // 5. Displaying Results using string concatenation (+) and new lines (\n)
        System.out.println("\n--- Travel Summary ---");
        System.out.println("Traveler: " + travelerName);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Time in Minutes: " + totalMinutes + " mins");

        // Close the scanner (Best Practice)
        input.close();
    }
}