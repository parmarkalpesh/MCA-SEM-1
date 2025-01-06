import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(!(str=br.readLine()).equals("."))
			{
			bw.write(str+"\n");
			}
		System.out.println("Content Written in Writer : ");
		bw.flush();
	}
}