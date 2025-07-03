package oops.encapsultion;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int id,salary;
		String name,dsgn,orgName;
		
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter OrgName : ");
		orgName = sc.nextLine();
		
		Employee e = new Employee();
		
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDsgn(dsgn);
		e.setOrgName(orgName);
		
		System.out.println(e.getId()+" " + e.getName()+" " + e.getSalary()+" " + e.getDsgn()+" " + e.getOrgName());
	}
}