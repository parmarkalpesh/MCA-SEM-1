// Interface definition
interface Greeting {
    void greet();
}

// Implementation of the interface
class GreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello from GreetingImpl");
    }
}

// Entry point class with main method
public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        greeting.greet(); // Output: Hello from GreetingImpl
    }
}
