import java.util.*;

@interface Methodinfo
{
	String author();
	String lastModified() default "03-12-2014";
}

public class Test
{
	
	@Methodinfo()
	public void display()
	{
		System.out.println("Test");
	}
	public static void main(String []args)
	{
		display();
	}
}