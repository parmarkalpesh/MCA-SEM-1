public class ParseIntExample {
    public static void main(String[] args) {
        String numberStr = "123";
        
        
        int number = Integer.parseInt(numberStr);
        
       
        System.out.println("The integer value is: " + number);
        
     
        try {
            String invalidStr = "123abc";
            int invalidNumber = Integer.parseInt(invalidStr); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for parsing: " + e.getMessage());
        }
    }
}
