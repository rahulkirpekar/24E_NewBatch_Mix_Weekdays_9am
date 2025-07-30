package exceptiontopic;

//    Exception
//       |
//  -----------------
// 1. checked Exception--Compiletime --compiler

//    RuntimeException
//       |
// -------------------
//2. Unchecked Exception



// 1. checked Exception
//public class InvalidAgeException extends Exception

//2. Unchecked Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
