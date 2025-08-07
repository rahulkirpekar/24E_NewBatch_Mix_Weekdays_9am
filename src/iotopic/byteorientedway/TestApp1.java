package iotopic.byteorientedway;

import java.io.FileOutputStream;
import java.util.Scanner;

//1. Byte oriented way --> 1. String--write into file
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name= sc.nextLine();// ABC
		
		// name(String)--convert into ---Byte
		
		byte b[] = name.getBytes();
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("test1.txt");
		
			fout.write(b);
		
			fout.close();
			
			System.out.println("success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
