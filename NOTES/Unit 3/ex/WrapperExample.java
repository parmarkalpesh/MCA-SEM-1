import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        // Using Integer (wrapper class) instead of int (primitive type)
        ArrayList<Integer> list = new ArrayList<>();
        
        // Autoboxing: Converting int to Integer
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Unboxing: Converting Integer to int
        int sum = 0;
        for (Integer num : list) {
            sum += num; // Unboxing happens here
        }
        
        System.out.println("Sum: " + sum);
    }
}
