package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		int a1[][] = new int[3][3];
//----------------------------------------------------------
		int [][]a2 = new int[3][3];
//----------------------------------------------------------
		int[][] a3 = new int[3][3];
//----------------------------------------------------------
		int [][] a4 = new int[3][3];
//----------------------------------------------------------
		int []a5[] = new int[3][3];
//----------------------------------------------------------
		int a6[][] = null ;
		a6 = new int[3][3];
//----------------------------------------------------------
		// Array Declaration and Initialisation
		int a7[][] = new int[][] {{1,2,3} , {4,5,6} , {7,8,9}} ;
//----------------------------------------------------------
		int a8[][] = new int[3][];
//----------------------------------------------------------

		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1.length; j++) 
			{
				System.out.println("Enter A["+i+"]["+i+"] " );
				a1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1.length; j++) 
			{
				System.out.println("A["+i+"]["+i+"] : " + a1[i][j]);
			}
		}
	}
}