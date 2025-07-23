package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Immutableway
		String s1 = "royal";
		System.out.println(s1+"---"+s1.hashCode());
		
		s1 = s1.concat("techno");
		System.out.println(s1+"---"+s1.hashCode());

		// mutable way
//		StringBuilder sb = new StringBuilder("Royal");
		StringBuffer sb = new StringBuffer("Royal");// Threadsafe---[Mullti-Threadding]
		System.out.println(sb +"---"+sb.hashCode());

		sb.append(" techno");
		System.out.println(sb +"---"+sb.hashCode());
	}
}
