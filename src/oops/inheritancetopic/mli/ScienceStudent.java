package oops.inheritancetopic.mli;

public class ScienceStudent extends Student
{
	String subject;
	
	public ScienceStudent() 
	{
	}
	public ScienceStudent(int rno, String name, int std, int marks, String subject) 
	{
		super(rno, name, std, marks);
		this.subject = subject;
	}
	void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" "+marks+" " + subject);
	}
}
