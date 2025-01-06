class OuterClass1 {
    private String outerMember = "Outer Member";

    class InnerClass {
        void display() {
            // Accessing member of the outer class
            System.out.println("Outer Member: " + outerMember);
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass1 outerObject = new OuterClass1();
        OuterClass1.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display(); // Output: Outer Member: Outer Member
    }
}
