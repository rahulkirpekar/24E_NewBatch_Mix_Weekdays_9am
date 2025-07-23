package stringtopic.immutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "technosoft";

		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		
		// imuutable behaviour
		String name3 = name1.concat(name2);// royaltechnosoft 
		
		System.out.println("name1 : " + name1);
		System.out.println("name2 : " + name2);
		System.out.println("name3 : " + name3);
	}
}
