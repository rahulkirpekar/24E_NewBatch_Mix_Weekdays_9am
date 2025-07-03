package oops.statictopic;

import java.util.Scanner;

public class Student 
{
	int rno,std;
	String name;
	static String schoolName;

	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	
	public static void main(String[] args) 
	{
		Student.setSchoolName("DPS");
		
		Student s[] = new Student[5];//[rno name std]
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
	private void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + schoolName);
	}
}
