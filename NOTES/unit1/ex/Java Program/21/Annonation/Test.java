
import java.lang.annotation.*;
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Test
{
	String comments() default "No Comment";	
}