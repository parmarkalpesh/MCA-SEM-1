class Rectangle
{
        int l,w;
        Rectangle(int x,int y)
        {
                l=x;
                w=y;
        }
        int rectArea()
        {
                return(l*w);
        }
}
class ex9
{
        public static void main(String args[])
        {
                Rectangle r1=new Rectangle(10,15);
                int area=r1.rectArea();
                System.out.println("Area = " + area);
        }
}

