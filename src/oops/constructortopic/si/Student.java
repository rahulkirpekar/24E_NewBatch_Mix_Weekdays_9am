package oops.constructortopic.si;

// Child class				// Parentclass
public class Student extends Person
{
	int rno,std,marks;
	
	public Student() 
	{
		System.out.println("Student--Defualt Contructor");
	}
	
	public Student(int rno, String name, int std, int marks) 
	{
		super(name);
		System.out.println("START :: PARA Student--Contructor");
		this.rno = rno;
		this.std = std;
		this.marks = marks;
		System.out.println("EXIT :: PARA Student--Contructor");
	}
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);	
	}
}
