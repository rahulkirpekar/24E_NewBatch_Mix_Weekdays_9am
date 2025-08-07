package iotopic.charorientedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name= sc.nextLine();// ABC
		
		try 
		{
			FileWriter fw = new FileWriter("royallist.txt");
		
			fw.write(name);
		
			fw.close();
			System.out.println("success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
