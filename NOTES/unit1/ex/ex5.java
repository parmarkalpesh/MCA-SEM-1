import java.io.DataInputStream;
class ex5
{
        public static void main(String args[])
        {
                DataInputStream in=new DataInputStream(System.in);
                int a,b,c;
                float x,y,z;

                try
                {
                        System.out.println("Enter Two Integer Value");
                        a=Integer.parseInt(in.readLine());
                        b=Integer.parseInt(in.readLine());

                        System.out.println("Enter Two Float Value");
                        x=Float.parseFloat(in.readLine();
                        y=Float.parseFloat(in.readLine();
                }
                catch(Exception e)
                {}

                c=a+b;
                z=x+y;

                System.out.println("Addition Of Two Integer = "+c);
                System.out.println("Addition Of Two Float   = "+z);
        }              
}
