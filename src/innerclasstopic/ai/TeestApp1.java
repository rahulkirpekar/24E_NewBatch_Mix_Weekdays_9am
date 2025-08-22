package innerclasstopic.ai;

public class TeestApp1 
{
	public static void main(String[] args) 
	{
		// Anonymous Innerclass
		A obj = new A() 
		{
			@Override
			void addFun(int no1, int no2) 
			{
				System.out.println("Addition : " + (no1+no2));
			}
		};
		
		obj.addFun(20, 10);
	}
}
