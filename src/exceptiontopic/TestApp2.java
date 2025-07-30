package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1= sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2= sc.nextInt();
		
		int ans ;

		// Nested try...catch
		try 
		{
			try 
			{
				ans  =  no1/ no2;
			} catch (Exception e) 
			{
				ans = 0;
				e.printStackTrace();
			}
			
			try 
			{
				
				String name = null;
				System.out.println("name.length() : "+name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			} 

			
			try 
			{
				String name1=  "royal";
				System.out.println(name1.charAt(name1.length()));// StringIndexOutofBoundException
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}catch (Exception e) 
		{
			ans = 0;
			e.printStackTrace();
		}
		System.out.println("Division : " + ans);
	}
}
