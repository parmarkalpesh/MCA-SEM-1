package com.pcs;
public class Student 
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
	@Override
	public String toString() {		
		return stdid+" "+name+" "+grade;
	}

}
