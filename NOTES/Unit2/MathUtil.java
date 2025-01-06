class MathUtil {
    static int add(int a, int b) { // Static method
        return a + b;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        int sum = MathUtil.add(5, 3); // Calling static method without creating an instance
        System.out.println("Sum: " + sum); // Output: Sum: 8
    }
}
