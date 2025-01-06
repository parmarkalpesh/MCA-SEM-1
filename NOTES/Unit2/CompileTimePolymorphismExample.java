public class CompileTimePolymorphismExample {

    // Method with one parameter
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Overloaded method with two parameters
    public void display(int a, int b) {
        System.out.println("Arguments: " + a + ", " + b);
    }

    // Overloaded method with different parameter type
    public void display(String s) {
        System.out.println("Argument: " + s);
    }

    public static void main(String[] args) {
        CompileTimePolymorphismExample example = new CompileTimePolymorphismExample();
        example.display(5);          
        example.display(5, 10);      
        example.display("Hello");   
    }
}
