import java.io.*;
class Student implements Serializable
{
	private transient int rno;
	private String name;
	private int total;
	Student(){}
	Student(int rno,String name,int total){
		this.rno=rno;
		this.name=name;
		this.total=total;
	}
	public String toString()
	{
		return rno+" "+name+" "+total+"\n";
	}
}
class TestStudent
{
	public static void main(String []args) throws Exception
	{
		Student s1 = new Student(101,"Ram",590);		
		Student s2 = new Student(102,"Laxman",470);
		Student s3 = new Student(103,"Hanuman",450);

		//Serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(args[0]));
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		oos.flush();
		oos.close();

		//Deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(args[0]));
		Student s4 = (Student)ois.readObject();
		Student s5 = (Student)ois.readObject();
		Student s6 = (Student)ois.readObject();
		System.out.println(s4+""+s5+""+s6);
	}
}










