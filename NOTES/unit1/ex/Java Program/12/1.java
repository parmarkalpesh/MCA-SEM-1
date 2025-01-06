import java.util.Arrays;
class Arr1
{
public static void main(String []args)
	{
	int a[]={1,2,3,4,5};
	Arrays.fill(a,6);
	System.out.println("After Arrays.fill with 2 Parameters");
	for(int p:a)
		System.out.println(p);
	Arrays.fill(a,2,a.length,7);
	System.out.println("After Arrays.fill with 4 Parameters");
	for(int p:a)
		System.out.println(p);
	}
}