class Main {
    // Method Definition
    void greet() {
        System.out.println("Hello");
        System.out.println("How do you do?");
    }

    public static void main(String[] args) {
        // To call a non-static method, we must create an object of the class
        Main obj = new Main(); 
        
        // Calling the method using the dot operator
        obj.greet(); [cite: 41, 46, 57]
    }
}