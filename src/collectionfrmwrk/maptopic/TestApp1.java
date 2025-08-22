package collectionfrmwrk.maptopic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// not maintain insertion order--key
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Insertion Order --key
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		// Sorting--key
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(11, "Ketul");// entry--[Key,Value]
		map.put(2, "ramesh");
		map.put(33, "sagar");
		map.put(14, "krishna");
		map.put(5, "sagar");
		
		for( Map.Entry<Integer, String>  e : map.entrySet()) 
		{
			System.out.println(e.getKey()+"---"+e.getValue());
		}
	}
}
