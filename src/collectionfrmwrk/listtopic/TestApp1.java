package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(true);//0  boolean---object  <==itr
		list.add('R');//1   char--charas object
		list.add(12);//2 Integer---object
		list.add(4341L);//3
		list.add(2134f);//4
		list.add(5544.324);//5
		list.add("Royal");//6
		
		Student s1= new Student(1, "Rahul", 12);
		list.add(s1);//7
		
		System.out.println("list.size() : " + list.size());//8

		
		list.stream().forEach
		(
				obj -> 
				{
					if(obj instanceof Student) 
					{
						Student s= (Student)obj;
						s.dispData();
					}else 
					{
						System.out.println(obj);
					}
				}
		);
		
/*		
		// 1. for loop list iterate
		// Iteerator
		Iterator itr =  	list.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				s.dispData();	
			}else 
			{
				System.out.println( obj);
			}
		}
		//------------
		for (int i = 0; i < list.size(); i++) 
		{
			Object obj = list.get(i);
			if (obj instanceof Student) 
			{
					Student s = (Student)obj;
					
					System.out.print("list.get("+i+") : " );
					s.dispData();	
			}else 
			{
				System.out.println("list.get("+i+") : " + obj);
			}
		}
		// 2. for each
		for(Object obj : list) 
		{
			if (obj instanceof Student) 
			{
					Student s = (Student)obj;
					s.dispData();	
			}else 
			{
				System.out.println( obj);
			}
		}
 */	
	}
}