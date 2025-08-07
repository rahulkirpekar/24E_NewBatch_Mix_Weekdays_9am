package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr =   new FileReader("C:\\Users\\Royal\\eclipse-workspace\\24E_NewBatch_Mix_Weekdays_9am\\royallist.txt");

			int temp;
			
			while( (temp = fr.read())	!= -1) 
			{
				System.out.print((char)temp);
			}
		
			fr.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	} 
}
