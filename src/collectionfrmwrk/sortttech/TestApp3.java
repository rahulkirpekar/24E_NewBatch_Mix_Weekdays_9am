package collectionfrmwrk.sortttech;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		
		
		Student s1= new Student(1, "rahul", 12);
		Student s2= new Student(2, "brijesh", 2);
		Student s3= new Student(3, "ajay", 10);
		Student s4= new Student(4, "suresh", 4);
		Student s5= new Student(5, "ankur", 9);

		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for (int i = 0; i < list.size(); i++) 
		{
			Student s =	list.get(i);
			s.dispData();
		}
		System.out.println("Std Wisee Sorting : ");
		
		// Sorting 
		Collections.sort(list, new StdWiseStudentComparator());
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s =	list.get(i);
			s.dispData();
		}
		
		
		System.out.println("Name Wisee Sorting : ");
		
		// Sorting 
		Collections.sort(list, new NameWiseStudentComparator());
		
		for (int i = 0; i < list.size(); i++) 
		{
			Student s =	list.get(i);
			s.dispData();
		}

	}
}
