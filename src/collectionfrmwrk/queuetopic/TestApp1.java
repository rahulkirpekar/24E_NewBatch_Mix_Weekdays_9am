package collectionfrmwrk.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("rahul");
		queue.add("ankur");
		queue.add("sagar");
		queue.add("krunal");
		queue.add("rakesh");
		queue.add("ajay");

		while(!queue.isEmpty()) 
		{
			System.out.println(queue.poll());
		}
	}
}
