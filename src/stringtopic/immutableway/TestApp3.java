package stringtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String stmt1 = "This is Java which is developed by James Gosling";
		String stmt2 = "Java";
		
		// equals
//		System.out.println(name1.equalsIgnoreCase(name2));// true
//		System.out.println("name1.compareTo(name2) : "  + name1.compareTo(name2));
		
		System.out.println("stmt1.contains(stmt2) : " + stmt1.contains(stmt2)); 
	}
}
