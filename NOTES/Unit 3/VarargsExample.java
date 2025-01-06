public class VarargsExample {

    // Method with varargs
    public static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Calling method with different number of arguments
        printNumbers();              // Output: Number of arguments: 0
        printNumbers(1);             // Output: Number of arguments: 1   1
        printNumbers(1, 2, 3);       // Output: Number of arguments: 3   1 2 3
        printNumbers(5, 10, 15, 20); // Output: Number of arguments: 4   5 10 15 20
    }
}
