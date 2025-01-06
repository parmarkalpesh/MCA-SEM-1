class Student
{
        int rno;
        void getNumber(int n)
        {
        	rno=n;
        }
        void putNumber()
        {
        	System.out.println("Roll No. : ="+rno);
        }
}
class Test extends Student
{
        float p1,p2;
        void getMarks(float m1,float m2)
        {
        	p1=m1;
        	p2=m2;
        }
        void putMarks()
        {
        	System.out.println("Marks obtained");
        	System.out.println("Part1=" + p1);
        	System.out.println("Part2=" + p2);
        }
}
interface sports
{
	final float sw=6.0f;
	void putsport();
}
class result extends Test implements sports
{
        float total;
        public void putsport()
        {
        	System.out.println("Sports Score " +sw);
        }
        void display()
        {
        	total=p1+p2+sw;
        	putNumber();
        	putMarks();
        	putsport();
        	System.out.println("Total Score = "+total);
        }
}
class ex21
{
        public static void main(String args[])
        {
                result s1 = new result();
                s1.getNumber(1234);
                s1.getMarks(27.5f,33.0f);
                s1.display();
        }
}
