package collectionfrmwrk.sortttech;

import java.util.Scanner;

public class Student //implements Comparable<Student>
{
	int rno,std;
	String name;

	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void dispData()
	{
		System.out.println(rno+" " + name+" " + std);
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std  : ");
		std = sc.nextInt();
	}
//	@Override
//	public int compareTo(Student s2) 
//	{
//		if(getStd() > s2.getStd()) 
//		{
//			return 1;
//			
//		}else if(getStd() < s2.getStd()) 
//		{
//			return -1;
//			
//		}else 
//		{
//			return 0;
//		}
//	}
/*	
	@Override
	public int compareTo(Student s2) 
	{
		return getName().compareTo(s2.getName());
	}
*/
}



/*
Sorting Techniques:-
--------------------

	1. Comparable:-
	---------------
		compareTo(Object obj)

	2. Comparator:-
	---------------
		compare(Object obj1,Object obj2)

*/

	








