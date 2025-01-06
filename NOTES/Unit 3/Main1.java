class Counter {
    // static variable
    static int count = 0;

    // constructor
    Counter() {
        count++; // increment the static variable
        System.out.println("Count is: " + count);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Create objects of the Counter class
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
