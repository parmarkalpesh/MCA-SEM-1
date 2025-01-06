class A
{
public static void main(String s[])
	{
	byte a=5,b=10,c=64;
	System.out.println(a|b);
	System.out.println(a&b);
	System.out.println(a^b);
        System.out.println(~a);
	System.out.println(~b);
	System.out.println(c>>>3);
	c = (a>b)?a:b;
	System.out.println(c);

    System.out.println(9 >>> 4);

	}
}