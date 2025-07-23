package oops.abstracttopic.interfacetopic;

public interface Person 
{
	public static final int NO = 10;// public static final
	
	public abstract void getBehave(); // public abstract 
	
	// Person.testStatic();
	static void testStatic()
	{
		System.out.println("Static Method -- testStatic()");
	}
	
	default void testDefault()
	{
		System.out.println("Default Method -- testDefault()");
		testPrivate();
		testPrivate();
		testPrivate();
	}
	private void testPrivate()
	{
		System.out.println("private Method -- testPrivate()");
	}
}
