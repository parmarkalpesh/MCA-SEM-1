import java.util.*;
import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)

@interface Methodinfo
{
	String author() default "Kapil";
	String lastModified() default "03-12-2014";
}


public class Test
{
	
	@Methodinfo(author="Parag")
	public void display()
	{

	}
	public static void main(String []args)
	{
		
	}
}