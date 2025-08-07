package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NewBatch_Mix_Weekdays_9am\\src\\iotopic\\byteorientedway\\io-notes.txt");

			FileOutputStream fout =  new FileOutputStream("ionotes9am.txt");
		
			int temp ;
			while((temp = fin.read()) != -1) 
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
		
			fout.close();
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
