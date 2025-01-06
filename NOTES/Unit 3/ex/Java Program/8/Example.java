public class Example {

    public static void main(String[] argv) 
	{
	Example e = new Example();
	Class[] c = Example.class.getClasses();
	
        //for(Class c:Example.class.getClasses()) 
	//{
            System.out.println(c[0].getName());
            System.out.println(c[1].getName());
	    System.out.println(e.getClass().getName());
        //}
    }

    public class InnerClass3 {

    }

	
	public class InnerClass2 {

    }
}