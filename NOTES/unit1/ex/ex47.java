import java.lang.Exception;
class myException extends Exception
{
        myException(String msg)
        {
                super(msg);
        }
}
class ex47
{
        public static void main(String args[])
        {
                int x=5;
                int y=1000;

                try
                {
                        float z=(float)x/(float)y;
                        if(z<0.01)
                        {
                                throw new myException("No is too small");
                        }
                }
                catch(myException e)
                {
                        System.out.println("I have caught my own Exception");
                        System.out.println(e.getMessage());
                }
                finally
                {
                        System.out.println("Java Is Always With You");
                }
        }
}
