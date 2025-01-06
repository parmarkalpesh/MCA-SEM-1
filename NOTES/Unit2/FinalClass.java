final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { // This would cause a compile-time error
// }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display(); // Output: This is a final class.
    }
}
