class Animal6 {
    String name = "Animal";

    void display() {
        System.out.println("Name in Animal: " + name);
    }
}

class Dog extends Animal6 {
    String name = "Dog";

    void display() {
        System.out.println("Name in Dog: " + name);
        System.out.println("Name in Animal: " + super.name); // Accessing the superclass field
    }
}

public class SuperFieldExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        // Output:
        // Name in Dog: Dog
        // Name in Animal: Animal
    }
}
