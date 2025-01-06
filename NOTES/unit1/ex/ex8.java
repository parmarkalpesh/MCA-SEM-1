class Rectangle
{
        int l,w;
        void getData(int x,int y)
        {
                l=x;
                w=y;
        }
        int rectArea()
        {
                int a=l*w;
                return(a);
        }
}
class ex8
{
        public static void main(String args[])
        {
                int a1,a2;
                Rectangle r1 = new Rectangle();
                Rectangle r2 = new Rectangle();
                r1.l=15;
                r1.w=10;
                a1=r1.l*r1.w;
                r2.getData(20,30);
                a2=r2.rectArea();
                System.out.println("First area = " + a1);
                System.out.println("Second area = " + a2);
        }
}
