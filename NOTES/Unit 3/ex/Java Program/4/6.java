class A
{
 A()
{
B b =new B();
}
			
}
class B
{
 B()
{
C c =new C();
}

}
class C
{
C()
{
A a =new A();
}
}

class TestDemo
{
	
public static void main(String s[])
	{
	A a1=new A();
	 
	}
}



