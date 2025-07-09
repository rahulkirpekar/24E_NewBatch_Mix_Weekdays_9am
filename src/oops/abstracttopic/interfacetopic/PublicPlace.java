package oops.abstracttopic.interfacetopic;

public class PublicPlace implements Person
{
		@Override
		public void getBehave() 
		{
			System.out.println("PublicPlace : Citizen Behaviour");
		}	
		public void getPublicEvent() 
		{
			System.out.println("PublicPlace---Citizen---getPublicEvent()");
		}	
}
