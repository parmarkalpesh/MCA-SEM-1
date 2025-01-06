class C1
{

	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);

		Byte barray[] = new Byte[4];

		barray[0] = (byte) ((no >> 24) & 0xFF);
		barray[1] = (byte) ((no >> 16) & 0xFF);
		barray[2] = (byte) ((no >> 8) & 0xFF);
		barray[3] = (byte) (no & 0xFF);
		
		
		for(int i=0;i<4;i++)
			{
			System.out.println(barray[i]);
			}
		
	}
}