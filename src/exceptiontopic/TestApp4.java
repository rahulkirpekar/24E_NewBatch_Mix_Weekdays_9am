package exceptiontopic;

import java.util.Scanner;

// throw--checked exception
// throws----declare checked exception
public class TestApp4 
{
	public static void isValidAgeForVote(int age) //throws InvalidAgeException
	{
		if(age < 18) 
		{
			// raise cehcked--exception
			throw new InvalidAgeException("\n\t\"Invalid Age,\n\t\tPlease enter valid Age\"");
		}else 
		{
			System.out.println("Welcome for Vote ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age for Vote :  ");
		int age = sc.nextInt();
		try 
		{
			isValidAgeForVote(age);
			
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("General Stateement");
	}
}
