class OuterClass2 {
    void outerMethod() {
        String localVariable = "Local Variable";

        class LocalInnerClass {
            void display() {
                // Accessing local variable of the enclosing method
                System.out.println("Local Variable: " + localVariable);
            }
        }

        LocalInnerClass localInnerObject = new LocalInnerClass();
        localInnerObject.display(); // Output: Local Variable: Local Variable
    }
}

public class LocalInnerClassExample {
    public static void main(String[] args) {
        OuterClass2 outerObject = new OuterClass2();
        outerObject.outerMethod();
    }
}
