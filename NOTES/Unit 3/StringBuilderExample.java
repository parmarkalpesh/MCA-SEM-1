public class StringBuilderExample   {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append strings to the StringBuilder object
        sb.append("Hello, ");
        sb.append("World!");
        sb.append(" Welcome to Java programming.");

        // Convert StringBuilder to String
        String finalString = sb.toString();

        // Output the result
        System.out.println(finalString);
    }
}
