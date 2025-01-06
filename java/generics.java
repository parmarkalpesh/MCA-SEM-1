public class generics<T> {
    void print(T var)
    {
        System.out.println("var");
    }
    public static void main(String[] args) {
        generics<Integer> obj1 = new generics<Integer>();
        generics<String> obj2 = new generics<String>();
        
        obj1.print(10);
        obj2.print("I am String");
    }
}
