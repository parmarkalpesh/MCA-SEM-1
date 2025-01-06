class StaticBlockExample {
    static int num;
    static String str;

    // Static block
    static {
        num = 42;
        str = "Hello, World!";
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Num: " + num); // Output: Num: 42
        System.out.println("Str: " + str); // Output: Str: Hello, World!
    }
}
