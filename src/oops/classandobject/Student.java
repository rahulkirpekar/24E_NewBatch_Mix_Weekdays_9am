package oops.classandobject;

import java.util.Scanner;

//  [Data Security]--->Dm's--private
//      |
//-------------------
// Pure Encapsulation === > [Dm's(private)   +  Mf's (public)]

public class Student 
{
	// 1. Dm's
	private int rno,std;
	private String name;
	
	// 2. Mf's
 	public void scanData() 
 	{
 		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Rno : ");                      
		rno = sc.nextInt();                                   
		sc.nextLine();                                           
		System.out.println("Enter Name: ");                      
		name = sc.nextLine();                                 
		System.out.println("Enter Std : ");                      
		std = sc.nextInt();        
 	}
 	public void dispData() 
 	{
 		System.out.println(rno + " " + name+" " + std); 
 	}
}

