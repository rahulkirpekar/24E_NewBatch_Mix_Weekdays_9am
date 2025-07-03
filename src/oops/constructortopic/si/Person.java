package oops.constructortopic.si;
/*
   	Person[name]
   	  |
   	Student[rno std marks] 
*/
public class Person 
{
	// default scope[Java scope]--within package
	String name;
	
	public Person() 
	{
		System.out.println("Person--Defualt Contructor");
	}
	
	Person(String name)
	{
		System.out.println("Person--PARA Contructor");
		this.name=name;
	}
}