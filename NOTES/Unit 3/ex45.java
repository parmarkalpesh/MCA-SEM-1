class ex45
{
	public static void main (String args[])
	{
		int invalid=0;
                int no,count=0;

                for (int i=0;i<args.length;i++)
                {
                        try
                        {
                                no=Integer.parseInt(args[i]);
                        }
                        catch(NumberFormatException e)
                        {
                                invalid=invalid+1;
                                System.out.println("Invalid Number "+args[i]);
                                continue;
                        }
                        count=count+1;
                }
                System.out.println("Valid Numbers "+ count);
                System.out.println("Invalid Numbers "+ invalid);

	}
}
