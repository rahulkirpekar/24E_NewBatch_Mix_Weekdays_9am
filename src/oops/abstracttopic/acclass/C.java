package oops.abstracttopic.acclass;

public class C extends B
{
	
	int no3 ;
	
	C()
	{
		no3 = 30;
		System.out.println("C Default Constructor : " + no3);
	}
	
	public static void main(String[] args) 
	{
		C obj = new C();
		
	}
	@Override
	void test3() 
	{
		
	}
}
