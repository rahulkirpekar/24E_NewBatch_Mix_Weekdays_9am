package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		int a[] = new int[5];
//		float b[] = new float[5];
//		char c[] = new char[5];

		
// 		Array Declaration
//-------------------------------------------
//		int a1[] = new int[5];
//-------------------------------------------
		int a2[] = null;
		a2 = new int[5];
//-------------------------------------------
//		int []a3 = new int[5];
//-------------------------------------------
//		int[] a4 = new int[5];
//-------------------------------------------
//		int [] a5 = new int[5];
//-------------------------------------------

// 		Array Declaration with Initialisation
//		int a6[] = {10,20,30,40};
		
		System.out.println("a1.length : " + a2.length);
		
		for (int i = 0; i < a2.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a2.length; i++) 
		{
			System.out.println("A["+i+"] : " + a2[i]);
		}
	}
}
