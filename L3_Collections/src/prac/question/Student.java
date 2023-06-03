package prac.question;

import java.util.Arrays;

public class Student {

	int id;
	String name;
	int marks[];
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
	
}
