public class UnitConverter {
    // This method takes a 'double' as input and returns a 'double' as output
    public double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles; // Sends the result back to the caller [cite: 112, 118]
    }

    public static void main(String[] args) {
        UnitConverter uc = new UnitConverter();
        // Passing '5.0' as an argument and storing the returned result
        double result = uc.convertKmToMiles(5.0); 
        System.out.println("Distance in miles: " + result);
    }
}