package oops.inheritancetopic.constructor;

public class B extends A
{
	int no2;
	
	public B() 
	{
		super(1000);// super()--[Default constructor]
		System.out.println("B--Default Constructor");
		no2=200;
	}
	public B(int no2) 
	{
		this();// this()--[Default constructor]
		System.out.println("B--PARA Constructor");
		this.no2 = no2;
	}
}
