public class Base 
{
    public  String name = "Base";
    public  String getName() 
    { 
	return name; 
    }
}


public class Sub extends Base 
{
    public String name = "Sub";
    public String getName() 
    { 
 	return name; 
    }
}

***** Case 1 ******

class Program 
{
  public static void main(String[] args) 
  {
    Sub s = new Sub();
    System.out.println(s.name); //Output "Sub"
  }
}


******* case 2 ******
class Program 
{
  public static void main(String[] args) 
  {
    Sub s  = new Sub();
    Base b = s;
    System.out.println(s.name); //Output "Sub"
    System.out.println(b.name); //Output "Base"
  }
}