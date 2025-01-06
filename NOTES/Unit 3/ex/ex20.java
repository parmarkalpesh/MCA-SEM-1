interface area
{
        final static float pi=3.14f;
        float compute(float x,float y);
}
class rectangle implements area
{
        public float compute(float x,float y)
        {
                return(x*y);
        }
}
class circle implements area
{
        public float compute(float x,float y)
        {
                return(pi*x*x);
        }
}
class ex20
{
        public static void main(String args[])
        {
                rectangle r1=new rectangle();
                circle c1=new circle();
                System.out.println("Area Of Rectangle = "+r1.compute(10,20));
                System.out.println("Area Of Circle    = "+c1.compute(10,0));
        }
}
