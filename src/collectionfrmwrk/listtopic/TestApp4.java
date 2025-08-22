package collectionfrmwrk.listtopic;

import java.util.Vector;
import java.util.Iterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
//		LinkedList<String>list = new LinkedList<String>();
		Vector<String>list = new Vector<String>();

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
	}
}
