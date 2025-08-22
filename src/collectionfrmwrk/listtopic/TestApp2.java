package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
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
		
//		list.remove("krunal");
//		list.remove(3);
		
		list.set(3, "Krunal Patel");
		
		itr = list.iterator();
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
		
	}
}
/*
	1. add
	2. set(index,Object)//update
	3. remove(index)
	4. display all records

*/














