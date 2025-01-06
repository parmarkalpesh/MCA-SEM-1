abstract class Shape {
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("Displaying shape with color: " + color);
    }
}
