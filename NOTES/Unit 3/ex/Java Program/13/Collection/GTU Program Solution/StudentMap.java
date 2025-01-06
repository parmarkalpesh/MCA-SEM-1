package com.pcs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMap {
		public static void main(String []args)
		{
			Student s1 = new Student(101,"Ram", "AA");
			Student s2 = new Student(102,"Laxman", "Ab");
			Student s3 = new Student(103,"Sita", "BB");
			HashMap h = new HashMap();
			h.put(1, s1);
			h.put(2, s2);			
			h.put(3, s3);	
			
			Set s = h.entrySet();
			for(Object o:s)
			{
				Map.Entry m = (Map.Entry)o;
				System.out.println(m.getValue());
				
			}
		}
}
