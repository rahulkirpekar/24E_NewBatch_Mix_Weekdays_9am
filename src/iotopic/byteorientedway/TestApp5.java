package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin  = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\24E_NewBatch_Mix_Weekdays_9am\\test7.txt");
			
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s1 = (Student)oin.readObject();
			
			s1.dispData();
			
			oin.close();
			fin.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
