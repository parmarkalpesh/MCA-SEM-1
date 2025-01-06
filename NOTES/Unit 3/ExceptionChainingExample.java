public class ExceptionChainingExample {

    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }

    // Simulate file processing that can throw exceptions
    public static void processFile(String fileName) throws CustomException {
        try {
            readFile(fileName);  // This method might throw an IOException
        } catch (Exception e) {
            throw new CustomException("Failed to process file: " + fileName, e); // Chaining the exception
        }
    }

    // Simulate file reading that throws an IOException
    public static void readFile(String fileName) throws Exception {
        throw new Exception("File not found");  // Simulating an exception
    }
}

// Custom exception class that supports chaining
class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);  // Pass the cause to the superclass
    }
}
