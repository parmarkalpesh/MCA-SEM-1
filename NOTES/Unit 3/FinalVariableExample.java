public class FinalVariableExample {
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        System.out.println("The maximum value is: " + MAX_VALUE);
          //MAX_VALUE = 200; // This would cause a compile-time error
    }
}
