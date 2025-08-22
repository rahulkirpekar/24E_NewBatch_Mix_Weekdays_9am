package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while(choice != 5) 
		{
			System.out.println("Enter below choice : ");
			System.out.println("1) For Insert Student");
			System.out.println("2) For Update Student");
			System.out.println("3) For Delete Student");
			System.out.println("4) For Display All Student Records");
			choice = sc.nextInt();
			
			switch(choice) 
			{
				case 1: Student s = new Student();
						s.scanData();
						list.add(s);
						System.out.println("Student successfully Inserrted");
						break;
				case 2:
						break;
				case 3:
						break;
						
				case 4: Iterator<Student> itr = 	list.iterator();
						while(itr.hasNext())
						{
							Student s1= itr.next();
							s1.dispData();
						}
						break;
				case 5:
						break;
			
			}
		}	
	}
}
