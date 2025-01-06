class OuterClass {
    private static String staticMember = "Static Member";
    private String nonStaticMember = "Non-static Member";

    static class StaticNestedClass {
        void display() {
            // Accessing static member of the outer class
            System.out.println("Static Member: " + staticMember);
            
            // Non-static member access will cause a compile-time error
            // System.out.println("Non-static Member: " + nonStaticMember);
        }
    }
}

public class StaticNestedClassExample {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display(); // Output: Static Member: Static Member
    }
}
