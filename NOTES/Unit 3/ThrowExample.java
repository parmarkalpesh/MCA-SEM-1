public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15);  // This will throw an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Handle the exception
        }
    }
    
    // Method that throws an exception if age is less than 18
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");  // Throwing an exception
        } else {
            System.out.println("Age is valid.");
        }
    }
}
