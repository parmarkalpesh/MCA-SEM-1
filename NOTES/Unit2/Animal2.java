// Superclass
class Animal2 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dog extends Animal2 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal2 {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();  // Inherited from Animal
        dog.bark(); // Method of Dog class

        cat.eat();  // Inherited from Animal
        cat.meow(); // Method of Cat class
    }
}
