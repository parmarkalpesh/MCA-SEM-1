public class Example {

    public static void main(String[] argv) 
	{
        for(Class c:Example.class.getClasses()) 
	{
            System.out.println(c.getName());
        }
    }

    public class InnerClass {

    }

}