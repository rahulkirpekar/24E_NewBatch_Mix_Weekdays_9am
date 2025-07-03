package oops.classandobject;

import java.util.Scanner;

public class TestApp1 
{
	// 3. main method                                            
	public static void main(String[] args) 
	{
		Student s1 = new Student();// s1--[rno name std]         
		Student s2 = new Student();// s2--[rno name std]         
		Student s3 = new Student();// s3--[rno name std]         
	                                                             
		System.out.println("s1 ==> "+ s1);                       
		System.out.println("s2 ==> "+ s2);                       
		System.out.println("s3 ==> "+ s3);                       
		// Student --Type of reference variable                  
		// s---reference variable                                
		                                                         
		// new --Keyword --jvm--allocate ---memmory---object     
		// Student--Object                                       
                                                                 
        s1.scanData();
        s2.scanData();
        s3.scanData();
        
        
        s1.dispData();
        s2.dispData();
        s3.dispData();
		
	}
}
