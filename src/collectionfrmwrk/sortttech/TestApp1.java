package collectionfrmwrk.sortttech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();

		list.add("rahul");
		list.add("ankur");
		list.add("sagar");
		list.add("krunal");
		list.add("rakesh");
		list.add("ajay");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
		System.out.println("------------------------");
		
		// Sorting
		Collections.sort(list);
		
		
		itr = list.iterator();
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
	}	
}
