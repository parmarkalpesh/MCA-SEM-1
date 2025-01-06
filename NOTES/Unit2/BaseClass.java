class BaseClass {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class DerivedClass extends BaseClass {
     void display() {
       System.out.println("Trying to override a final method.");
    }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display(); // Output: This is a final method.
    }
}
