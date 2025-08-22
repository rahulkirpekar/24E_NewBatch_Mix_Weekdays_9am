package collectionfrmwrk.settopic;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Not maintain Insertion order
//		HashSet<String> setObj = new HashSet<String>();
		
		// Insertion Order
//		LinkedHashSet<String> setObj = new LinkedHashSet<String>();
	
		// Sorting---Ascending Order
		TreeSet<String> setObj = new TreeSet<String>();
		
		setObj.add("rahul");
		setObj.add("ankur");
		setObj.add("sagar");
		setObj.add("krunal");
		setObj.add("rahul");
		setObj.add("ankur");
		setObj.add("sagar");
		setObj.add("rakesh");
		setObj.add("ajay");

		Iterator<String> itr = 	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = itr.next();
			
			System.out.println(name);
		}
	}
}
