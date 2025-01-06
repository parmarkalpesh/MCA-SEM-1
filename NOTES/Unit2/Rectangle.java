class Rectangle {
    private int length;
    private int breadth;

    // Constructor with two parameters
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor with one parameter, calls the two-parameter constructor
    public Rectangle(int side) {
        this(side, side); // Calls the Rectangle(int, int) constructor
    }

    // Method to calculate area
    public int getArea() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(15);
        System.out.println("Area of rectangle1: " + rectangle1.getArea()); // Output: 200
        System.out.println("Area of rectangle2: " + rectangle2.getArea()); // Output: 225
    }
}
