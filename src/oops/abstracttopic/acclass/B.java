package oops.abstracttopic.acclass;

public abstract class B extends A
{
	int no2;
	public B() 
	{
		no2=20;
		System.out.println("B : Default Constructor NO2 : " + no2);
	}

	abstract void test3(); 
	@Override
	void test1() 
	{
		
	}
}
