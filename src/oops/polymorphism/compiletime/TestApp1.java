package oops.polymorphism.compiletime;

// Compiletime Polymorphism---Method Overloadding
public class TestApp1 
{
	public static void addFun(short no1,short no2) 
	{
		int ans ;
		ans = no1+no2;
		System.out.println("Two(short) args - Addition "  +ans); 
	}
	public static void addFun(long no1,long no2) 
	{
		double ans ;
		ans = no1+no2;
		System.out.println("Two(long) args - Addition "  +ans); 
	}
	public static void addFun(double no1,double no2) 
	{
		double ans ;
		ans = no1+no2;
		System.out.println("Two(double) args - Addition "  +ans); 
	}
	public static void addFun(int no1,int no2,int no3) 
	{
		int ans ;
		ans = no1+no2+no3;
		System.out.println("Three args - Addition "  +ans); 
	}
	public static void addFun(int no1,int no2,int no3,int no4) 
	{
		int ans ;
		ans = no1+no2+no3+no4;
		System.out.println("Four args - Addition "  +ans); 
	}
	public static void main(String[] args) 
	{
		addFun('A', 'B');
	}
}
/*
	1. argument count 	
	2. argument type
	3. Type Pramotion Rule
	
	
	Type Pramotion Rule:--
	--------------------
	boolean----X
			
					byte
	  			     |
					short
					 |
char--------------->int
					 |
					long
					 |
					float
					  |
					double
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/