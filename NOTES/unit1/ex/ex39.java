import java.util.Arrays;

/**
 *
 * @author javadb.com
 */
public class Main {
    
    /**
     * Creates objects using the Car class which implements the Comparable
     * interface.
     * Compares and sorts the objects by mileage.
     */
    public void comparableExample() {
        
        //Creating the objects that implements the Comparable interface
        Car car1 = new Car("Toyota", 2006, 5000);
        Car car2 = new Car("BMW", 2007, 5000);
        Car car3 = new Car("Chrysler", 2007, 4000);
        
        //Comparing the objects by calling the compareTo method on one of them
        //passing another object as argument.
        System.out.println("Car 1 equals Car 2: " + car1.compareTo(car2));
        System.out.println("Car 1 equals Car 3: " + car1.compareTo(car3));
        System.out.println("Car 2 equals Car 3: " + car2.compareTo(car3));
        System.out.println();
        
        //To sort them we create an array which is passed to the Arrays.sort()
        //method.
        Car[] carArray = new Car[] {car1, car2, car3};
        Arrays.sort(carArray);
        
        //Print out the sorted array
        for (Car car : carArray)
            System.out.println(car.toString());
    }
    
    //The Car class used to compare and sort objects.
    class Car implements Comparable {
        
        private String make;
        private int year;
        private int mileage;
        
        public Car(String make, int year, int mileage) {
            
            this.make = make;
            this.year = year;
            this.mileage = mileage;
        }
        
        //Mandatory method when implementing the
        //Comparable interface. In this method we
        //compare the mileage of the two car objects.
        public int compareTo(Object obj) {
            
            if (obj instanceof Car) {
                
                Car car = (Car) obj;
                if (this.mileage > car.getMileage())
                    return 1;
                else if (this.mileage < car.getMileage())
                    return -1;
            }
            return 0;
        }
        
        public void setMake(String make) {
            this.make = make;
        }
        
        public void setYear(int year) {
            this.year = year;
        }
        
        public void setMileage(int mileage) {
            this.mileage = mileage;
        }
        
        public String getMake() {
            return make;
        }
        
        public int getYear() {
            return year;
        }
        
        public int getMileage() {
            return mileage;
        }
        
        public String toString() {
            
            StringBuffer buffer = new StringBuffer();
            buffer.append("Make: " + make + "\n");
            buffer.append("Year: " + year + "\n");
            buffer.append("Mileage: " + mileage + "\n");
            
            return buffer.toString();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().comparableExample();
    }
}