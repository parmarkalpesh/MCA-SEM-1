package MyPackage;
public class Student
{
	int rno;
	String fname;
	String mname;
	String lname;
	String adrs;
	int age;

	Student(){}
	Student(int rno,String fname,String mname,String lname,String adrs,int age)
	{
		this.rno=rno;
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
		this.adrs=adrs;
		this.age=age;
	}
	
	public String toString()
	{
		return rno+","+fname+","+mname+","+lname+","+adrs+","+age;
	}
	public int getRno()
	{
		return rno;
	}
	public void setRno(int rno)
	{
		this.rno=rno;
	}
	public String getFname()
	{
		return fname;
	}
}