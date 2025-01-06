// File: TestUtilities.java
import utilities.MathUtils;

public class TestUtilities {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 3);
        int difference = MathUtils.subtract(5, 3);

        System.out.println("Sum: " + sum); // Output: Sum: 8
        System.out.println("Difference: " + difference); // Output: Difference: 2
    }
}
