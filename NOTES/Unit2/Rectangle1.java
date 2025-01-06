class Rectangle1 extends Shape {
    double length, width;

    public Rectangle1(String color, double length, double width) {
        super(color);  // Calling the constructor of the abstract class Shape
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }
}
