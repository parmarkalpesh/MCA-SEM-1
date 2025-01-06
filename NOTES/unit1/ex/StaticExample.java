public class StaticExample {
    private static int num;

    // Static initializer block
    static {
        num = 50;
        System.out.println("Static initializer block executed.");
    }

    public StaticExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Value of num before object creation: " + StaticExample.num);
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
    }
}
