public class Example {
    private int num;

    // Instance initializer block
    {
        num = 100;
        System.out.println("Instance initializer block executed.");
    }

    // Constructor
    public Example() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("Value of num: " + obj.num);
    }
}
