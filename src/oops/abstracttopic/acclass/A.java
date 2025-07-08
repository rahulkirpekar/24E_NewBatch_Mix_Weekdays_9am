package oops.abstracttopic.acclass;

public abstract class A 
{
	int no1;
	
	public A() 
	{
		no1=10;
		System.out.println("A : Default Constructor NO1 : " + no1);
	}
	
	abstract void test1(); 
	void test2() 
	{
	} 
}