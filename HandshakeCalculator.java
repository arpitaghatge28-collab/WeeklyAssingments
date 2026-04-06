import java.util.Scanner;

public class HandshakeCalculator {
    // Method using combination formula [cite: 421]
    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2; [cite: 420]
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt(); [cite: 419]

        HandshakeCalculator calc = new HandshakeCalculator();
        int result = calc.calculateHandshakes(students);

        System.out.println("Maximum possible handshakes: " + result); [cite: 422]
        sc.close();
    }
}