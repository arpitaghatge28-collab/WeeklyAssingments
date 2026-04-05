class PenDistribution {
    public static void main(String[] args) {
        // Step 1: Declare variables for fixed values [cite: 217]
        int totalPens = 14;
        int numberOfStudents = 3;

        // Step 2: Perform calculations using operators 
        // Division (/) gives the number of pens each student gets
        int pensPerStudent = totalPens / numberOfStudents;

        // Modulus (%) gives the remaining non-distributed pens
        int remainingPens = totalPens % numberOfStudents;

        // Step 3: Display results [cite: 320, 321]
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           "\nand the remaining pen not distributed is " + remainingPens);
    }
}