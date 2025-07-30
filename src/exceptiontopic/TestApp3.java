package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
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
			// connection open ===> Db / Socket / File
		}
		catch (NullPointerException e) 
		{
			ans = 0;
			e.printStackTrace();
		}catch (ArithmeticException e) 
		{
			ans = 0;
			e.printStackTrace();
		}finally 
		{
			// connection---close
			System.out.println("Finally Block");
		}
		
		System.out.println("General Statement");
		
		
		
	}
}

/* 		// nested try..catch

1. nested try...catch
2. finally block
3. throw
4. throws
5. custom exception[user Defined Exception]
6. method overridding with exception
*/
