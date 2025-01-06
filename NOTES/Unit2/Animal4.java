class Animal4 {
    String name;

    // Superclass constructor
    public Animal4(String name) {
        this.name = name;
    }
}

class Dog extends Animal4 {
    String breed;

    // Subclass constructor
    public Dog(String name, String breed) {
        super(name); // Calling the superclass constructor
        this.breed = breed;
    }

    void display() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }
}

public class SuperConstructorExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display(); // Output: Name: Buddy, Breed: Golden Retriever
    }
}
