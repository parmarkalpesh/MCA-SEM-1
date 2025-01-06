import java.lang.annotation.*;
@Documented
@Target({ElementType.TYPE,ElementType.METHOD}) // class
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Tester
{
	public enum Subject
	{
		FOP,ORACLE,JAVA
	}
	String author() default "Parag";
	String lastModified() default "21-Nov-2014";
	Subject subject() default Subject.FOP;
}