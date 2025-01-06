import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            readFile("example.txt");  // Attempt to read a file
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    // Method that declares it throws an IOException
    static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);  // This can throw FileNotFoundException
        System.out.println("File read successfully.");
        fr.close();
    }
}
