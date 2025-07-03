package basic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3} , {4,5,6} , {7,8,9}};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				int no  = a[i][j];
				boolean flag = true;
				for (int k = 2; k <  no; k++) 
				{
					if (no%k==0) 
					{
						flag = false;
						break;
					}
				}
				if (flag) 
				{
					System.out.print("_\t");
				}else {
					System.out.print(a[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
}