import java.lang.reflect.Array;

class MainClass {
  public static void main (String args[]) {
    Object array = Array.newInstance(double.class, 3);
    
    Class type = array.getClass();
	System.out.println(type.isArray());
    if (type.isArray()) {
      
      System.out.println("Array of: " + type.getComponentType());
      System.out.println("Array size: " + Array.getLength(array));
    }
    
  }
}
         