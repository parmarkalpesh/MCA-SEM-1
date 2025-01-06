import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Student 
{
	private int stdid;
	private String name;
	private String grade;
	public Student() {}
	public Student(int stdid, String name, String grade) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.grade = grade;
	}
	
	public String toString() {		
		return stdid+" "+name+" "+grade;
	}

}

class StudentMap {
		public static void main(String []args)
		{
			Student s1 = new Student(101,"Ram", "AA");
			Student s2 = new Student(102,"Laxman", "Ab");
			Student s3 = new Student(103,"Sita", "BB");
			Map<Integer,Student> h = new TreeMap<Integer, Student>();
			h.put(1, s1);
			h.put(-2, s2);			
			h.put(3, s3);	
			
			Set s = h.entrySet();
			for(Object o:s)
			{
				Map.Entry m = (Map.Entry)o;
				System.out.println(m.getValue());
				
			}
		}
}
