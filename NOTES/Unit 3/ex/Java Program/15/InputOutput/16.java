import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		PipedReader i1=new PipedReader();
		PipedWriter o1=new PipedWriter();
		o1.connect(i1);
		char []b1={'A','B','C','D','E','F','G','H'};
		o1.write(b1,2,5);
		o1.write(b1,0,5);
		o1.flush();
		char []b2=new char[10];
		i1.read(b2,0,10);
		for(char ch:b2)
			System.out.print(ch);
		
	}
}