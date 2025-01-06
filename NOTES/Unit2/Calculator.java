class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three numbers using the two-parameter add method
    public int add(int a, int b, int c) {
        return this.add(a, b) + c; // Calls the add(int, int) method
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));         // Output: 5
        System.out.println("Sum of 1, 2 and 3: " + calculator.add(1, 2, 3));   // Output: 6
    }
}
