public class AbstractClassExample {
    public static void main(String[] args) {
        // Shape shape = new Shape("Red"); // This would cause a compile-time error since Shape is abstract

        Circle circle = new Circle("Blue", 5.5);
        circle.display(); // Displaying shape with color: Blue
        circle.draw();    // Drawing a circle with radius: 5.5

        Rectangle1 rectangle = new Rectangle1("Green", 4.0, 6.0);
        rectangle.display(); // Displaying shape with color: Green
        rectangle.draw();    // Drawing a rectangle with length: 4.0 and width: 6.0
    }
}
