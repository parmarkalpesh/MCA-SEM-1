public class StringBufferExample {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");

        
        sb.append(" World");
        System.out.println("After append: " + sb);

      
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

       
        sb.replace(6, 10, "JavaScript");
        System.out.println("After replace: " + sb);

        sb.delete(6, 16);
        System.out.println("After delete: " + sb);

    
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
      
        int length = sb.length();
        System.out.println("Length of StringBuffer: " + length);
    }
}
