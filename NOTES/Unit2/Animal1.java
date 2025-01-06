// Base class
class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Further derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // Inherited from Animal
        puppy.bark();  // Inherited from Dog
        puppy.weep();  // Method of Puppy class
    }
}
