import java.io.*;

class Student
{
int rollno;
String name;
int age;
float per;

//Constructor -------------------------------------------
Student()
{
}

Student(int r,String s,int a,float f)
	{
	this.rollno = r;
	this.name = s;
	this.age = a;
	this.per = f;
	}

Student(String s)
	{
	String s1[]=s.split(",");
	for(int i=0;i<s1.length;i++)
		{
			switch(i)
			{
			case 0:
				this.rollno=Integer.parseInt(s1[i]);
				break;
			case 1:
				this.name=s1[i];
				break;
			case 2:
				this.age=Integer.parseInt(s1[i]);
				break;
			case 3:
				this.per=Float.parseFloat(s1[i]);
				break;
			}
		}
	}

//GET Methods--------------------------------------
int getRollno()
	{
	return this.rollno;
	}

String getName()
	{
	return this.name;
	}

int getAge()
	{
	return this.age;
	}

float getPer()
	{
	return this.per;
	}

//SET Methods ---------------------------------------------
void setRollno(int r)
	{
	this.rollno=r;
	}

void setName(String s)
	{
	this.name = s;
	}

void setAge(int a)
	{
	this.age=a;
	}

void setPer(float f)
	{
	this.per=f;
	}

//toString() - OBJECT - STRING -------------------------
public String toString()
	{
	return this.rollno+","+this.name+","+this.age+","+this.per;
	}


}

class TestDemo
{

static void writeToFile(DataOutputStream dos, Student s[]) throws Exception
	{
	for(Student s1 : s)
		{
		dos.writeBytes(s1.toString()+"\n");
		}
	dos.flush();
	dos.close();
	}

static Student[] readFromFile(DataInputStream dis) throws Exception
	{
	String str;
	Student s[]=new Student[10];
	int i=0;
	while( (str=dis.readLine())!=null)
		{
		s[i++]=new Student(str);
		}
	dis.close();
	return s;
	}

//For Single Object -----------------------------------------------
static void writeToFile1(DataOutputStream dos, Student s) throws Exception
	{
	dos.writeBytes(s.toString()+"\n");
	dos.flush();
	}

static Student readFromFile1(DataInputStream dis) throws Exception
	{
	String str = dis.readLine();
	dis.close();
	return new Student(str);
	}

//------ MAIN Program --------------------------------------
public static void main(String args[]) throws Exception
	{
	
	Student s1 = new Student(12,"Kapil Shukla",30,64.8f);
	Student s2 = new Student(14,"Kapil Shukla",30,64.8f);
	DataOutputStream dos = new DataOutputStream(new FileOutputStream(args[0],true));
	TestDemo.writeToFile1(dos,s1);
	TestDemo.writeToFile1(dos,s2);
	dos.close();
	/*
	DataInputStream dis = new DataInputStream(new FileInputStream(args[0]));
	Student ss1=TestDemo.readFromFile1(dis);
	System.out.println("\n After Single Object Read Method :");
	System.out.println(ss1);
	
	Student sa[]=new Student[3];
	sa[0]=new Student(11,"Kapil",30,64.8f);
	sa[1]=new Student(12,"Parag",29,74.8f);
	sa[2]=new Student(13,"Deven",31,84.8f);
	dos = new DataOutputStream(new FileOutputStream(args[1]));
	TestDemo.writeToFile(dos,sa);
	*/
	DataInputStream dis = new DataInputStream(new FileInputStream(args[0]));
	Student sa1[]=TestDemo.readFromFile(dis);
	System.out.println("\n After Mutliple Object Read Method :");
	for(Student st : sa1)
		{
		if(st!=null)
			System.out.println(st);
		}
	
	}

}