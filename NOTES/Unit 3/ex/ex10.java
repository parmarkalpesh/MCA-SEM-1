class Room
{
        float l,w;
        Room(float x,float y)
        {
                l=x;
                w=y;
        }
        Room(float x)
        {
                l=w=x;
        }
        float area()
        {
                return(l*w);
        }
}
class ex10
{
        public static void main(String args[])
        {
                float a1,a2;
                Room r1=new Room(20.0f,15.0f);
                Room r2=new Room(20.0f);
                a1=r1.area();
                a2=r2.area();
                System.out.println("Area1 = "+a1);
                System.out.println("Area2 = "+a2);
        }
}
