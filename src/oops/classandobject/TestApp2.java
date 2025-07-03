package oops.classandobject;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];

		for (int i = 0; i < s.length; i++) 
		{
			// i--[0,1,2,3,4]
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}
