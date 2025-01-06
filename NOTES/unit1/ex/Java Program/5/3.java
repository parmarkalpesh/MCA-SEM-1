class A {
	int k;
	A(int m) {	
	k=m;
	}
	int getK() {
 		return k;
	}
}
class TestDemo
{
public static void main(String s[])
	{
	System.out.println(new A(10).getK());
	}
}
