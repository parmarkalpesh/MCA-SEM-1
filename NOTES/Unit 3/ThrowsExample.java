import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("file.txt");  // Call the method that may throw an exception
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    // Method that declares it throws an IOException
    static void readFile(String fileName) throws IOException {
        if (fileName.equals("file.txt")) {
            throw new IOException("File not found.");  // Throwing an exception
        }
        System.out.println("File read successfully.");
    }
}
