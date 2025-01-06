public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // Attempt to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    // Method that performs division
    static int divide(int a, int b) {
        return a / b;  // This can throw ArithmeticException
    }
}
