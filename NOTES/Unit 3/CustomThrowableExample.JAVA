public class CustomThrowableExample extends Throwable {
    public CustomThrowableExample(String message) {
        super(message);
    }
    
    public static void main(String[] args) {
        try {
            throwCustomThrowable();  // Throws custom Throwable
        } catch (CustomThrowableExample e) {
            System.out.println("Caught custom throwable: " + e.getMessage());
        }
    }
    
    static void throwCustomThrowable() throws CustomThrowableExample {
        throw new CustomThrowableExample("This is a custom Throwable.");
    }
}
