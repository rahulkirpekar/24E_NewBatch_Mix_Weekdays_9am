package oops.constructortopic;

public class Student 
{
	// Data member
	int rno;//0
	String name;//null
	int std;//0
	
	// object--dms' set values---1. Methods   2. Constructor
	
	// Type of Constructor
	
	// 1. Default 	2. Parameterised 	3. Copy 
	
	public Student()
	{
		System.out.println("======== START :: Default Constructor======== ");
		System.out.println("Before Value set -- "+rno+"  " + name+" " + std);
		
		rno = 1;
		name = "rahul";
		std = 12;
		
		System.out.println("After Value set -- "+rno+"  " + name+" " + std);
		System.out.println("======== EXIT :: Default Constructor======== ");
	}
	
	public Student(int rno,String name) 
	{
		System.out.println("======== START :: Para(Two args) Constructor======== ");
		System.out.println("Before Value set -- "+this.rno+"  " + this.name+" " + this.std);

		this.rno = rno;
		this.name =  name; 
		
		System.out.println("After Value set -- "+this.rno+"  " + this.name+" " + this.std);
		System.out.println("======== EXIT :: Para(Two args) Constructor======== ");
	}
	public Student(int rno,String name,int std) 
	{
		System.out.println("======== START :: Para Constructor======== ");
		System.out.println("Before Value set -- "+this.rno+"  " + this.name+" " + this.std);

		this.rno = rno;
		this.name =  name; 
		this.std= std;
		
		System.out.println("After Value set -- "+this.rno+"  " + this.name+" " + this.std);
		System.out.println("======== EXIT :: Para Constructor======== ");
	}
	
	public Student(Student s) 
	{
		System.out.println("======== START :: Copy Constructor======== ");
		System.out.println("Before Value set -- "+this.rno+"  " + this.name+" " + this.std);

		this.rno = s.rno;
		this.name =  s.name; 
		this.std= s.std;
		
		System.out.println("After Value set -- "+this.rno+"  " + this.name+" " + this.std);
		System.out.println("======== EXIT :: Copy Constructor======== ");
	}
	public static void main(String[] args) 
	{
		// JVM Default Constructor---Set--Default Values--Data members
//		Student s1 = new Student();
		Student s2 = new Student(1,"Ankur");
		
		System.out.println(s2+"--s2---" + s2.rno+" " + s2.name+" " + s2.std);
		
		
		
//		System.out.println(s1+"--s1---" + s1.rno+" " + s1.name+" " + s1.std);
//		System.out.println(s2+"--s2---" + s2.rno+" " + s2.name+" " + s2.std);

//		Student s3 = new Student(s2);
//		System.out.println(s3+"--s3---" + s3.rno+" " + s3.name+" " + s3.std);
		
		
/*		// Local Variable
		int no1,no2,ans;
		no1 = 10;
		no2 = 20;
		ans  = no1 + no2;
		System.out.println("Addition : " + ans);
*/		
	}
}
// Destructor --- Garbage Collector---[objects--scope--delete]

