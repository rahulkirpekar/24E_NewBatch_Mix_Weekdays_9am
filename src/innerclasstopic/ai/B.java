package innerclasstopic.ai;

public class B extends A
{
	@Override
	void addFun(int no1, int no2) 
	{
		System.out.println("Addition : " + (no1+no2));
	}
	
	public static void main(String[] args) 
	{
		B obj = new B();
		
		obj.addFun(20, 10);
		
	}
}
