class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);  // Calling the constructor of the abstract class Shape
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}
