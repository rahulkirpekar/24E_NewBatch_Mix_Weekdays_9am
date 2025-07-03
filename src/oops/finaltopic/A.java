package oops.finaltopic;

public class A 
{
	// 1. assign--Dm's
	final int no ;// = 10;
	
	// 2. Default Constructor
	A()
	{
		no = 100;
	}
	
	// 3. arg. Constructor
	A(int no)
	{
		this.no = no;
	}
	
	public static void main(String[] args) 
	{
		A obj  = new A(2000);
		
		System.out.println("obj.no : " + obj.no);
		
//		obj.no = 200;//C.E
//		System.out.println("Updated obj.no : " + obj.no);
		
		
//--------Local Variable-----------		
//		final int no = 10;
//		System.out.println("No : " + no);
//		no = 10;// C.E
//		System.out.println("Updated No : " + no);
	}
}
