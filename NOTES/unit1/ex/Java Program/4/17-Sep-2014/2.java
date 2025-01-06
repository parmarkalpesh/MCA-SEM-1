class Student
{
int rollno=0;
static int boy=0;
static int girl=0;

	//Student()
	//	{
		//something
		//cnt++;
		//rollno=cnt;
	//	}

	Student(int no)
		{
		if(no==1)
		{
		boy++;
		rollno=boy + girl;
		}
		else
		{
		girl++;
		rollno=boy + girl;
		}
		
		}
static void TotalObj()
	{
	System.out.println(boy + girl);
	}

}

class C
{

public static void main(String s[])
	{
	Student sanjay=new Student(1);
	Student amit=new Student(1);
	Student sonali=new Student(2);
	Student dipti=new Student(2);
	System.out.println(sanjay.rollno);
	System.out.println(dipti.rollno);
	System.out.println("Total Boys: " + sanjay.boy);
	System.out.println("Total Girls: " + dipti.girl );
	//System.out.println("Total Students: " + (sonali.girl + amit.boy));
	Student.TotalObj();
	}
}