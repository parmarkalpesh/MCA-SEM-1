public class StringFunctionsDemo {
    public static void main(String[] args) {
        
        String str = "Hello, World!";
             
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);
        
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);
       
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
    
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
     
        String substring = str.substring(7, 12);
          System.out.println("Substring: " + substring);
     
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);
      
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);
   
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);
        
        String strWithWhitespace = "   Hello, Java!   ";
        String trimmedStr = strWithWhitespace.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
