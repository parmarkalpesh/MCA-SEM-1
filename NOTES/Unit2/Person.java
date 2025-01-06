class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name; 
        this.age = age;   
    }

    
    public void displayDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.displayDetails(); // Output: Name: Alice, Age: 30
    }
}
