interface IBase 
{
  String name = "base";
}

interface ISub extends IBase 
{
  String name = "sub";
}

public class Shadow implements ISub 
{
  String name = "shadow";

  void print(Strig name)
  {
    System.out.println("method name = " + name);
    System.out.println("class name = " + this.name);
    System.out.println("IBase name = " + 
          ((IBase) this).name);
    System.out.println("ISub name = " + 
          ((ISub) this).name);
  }

  public static void main(String[] args) {
    (new Shadow()).print("parameter");
  }
}

**********
The output of this program is: 

method name = parameter
name = shadow
IBase name = base
ISub name = sub