public class Car {
    // Fields
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getter and setter methods for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and setter methods for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and setter methods for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    }

    // Method to calculate depreciation
    public double calculateDepreciation() {
        int currentYear = 2024;
        int age = currentYear - year;
        double depreciation = age * 0.05 * price;
        return price - depreciation;
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car = new Car("Toyota", "Camry", 2020, 24000.0);
        car.displayDetails(); // Output: Make: Toyota, Model: Camry, Year: 2020, Price: 24000.0

        // Calculating and displaying depreciation
        double depreciatedValue = car.calculateDepreciation();
        System.out.println("Depreciated Value: " + depreciatedValue);
    }
}
