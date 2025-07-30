package exceptiontopic;

import java.util.Scanner;

// Exception Recoverable---[Exception Handling]----->[try...catch...]
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1= sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2= sc.nextInt();
		
		int ans ;

		
		try 
		{
			
			
			ans  =  no1/ no2;
			
			String name = null;
			System.out.println("name.length() : "+name.length());
			
			
			name=  "royal";
			System.out.println(name.charAt(name.length()));// StringIndexOutofBoundException
			
		}catch(ArithmeticException e) 
		{
			ans = 0;
			System.out.println("ArithmeticException-- Block Handled Exception");
			e.printStackTrace();
		}catch(NullPointerException e) 
		{
			ans = 0;
			System.out.println("NullPointerException-- Block Handled Exception");
			e.printStackTrace();
		}catch (Exception e) 
		{
			ans = 0;
			e.printStackTrace();
		}
		
		System.out.println("Division : " + ans);
	}
}
