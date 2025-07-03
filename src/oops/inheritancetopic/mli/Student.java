package oops.inheritancetopic.mli;

public class Student extends Person
{
	int rno,std,marks;
	
	public Student() 
	{
	}
	public Student(int rno, String name,int std, int marks) 
	{
		super(name);
		this.rno = rno;
		this.std = std;
		this.marks = marks;
	}
}
