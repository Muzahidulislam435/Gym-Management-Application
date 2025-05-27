package classes;

import java.lang.*;
import interfaces.*;

public class Gym implements AccountOperations, EmployeeOperations, MemberOperations
{
	private String name;
	private Account accounts[] = new Account [500];
	private Member members[] = new Member [200];
	private Employee employees[] = new Employee [50];
	
	public Gym(){}
	public Gym(String name)
	{
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public boolean insertAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAccount(Account a)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Account searchAccount(String accountNumber)
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber().equals(accountNumber))
				{
					return accounts[i];
				}
			}
		}
		return null;
	}
	
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				accounts[i].showDetails();
			}
		}
	}
	
	
	public boolean insertMember(Member m)
	{
		for(int i=0; i<members.length; i++)
		{
			if(members[i] == null)
			{
				members[i] = m;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeMember(Member m)
	{
		for(int i=0; i<members.length; i++)
		{
			if(members[i] == m)
			{
				members[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Member searchMember(int id)
	{
		for(int i=0; i<members.length; i++)
		{
			if(members[i] != null)
			{
				if(members[i].getId() == id)
				{
					return members[i];
				}
			}
		}
		return null;
	}
	
	public void showAllMembers()
	{
		for(int i=0; i<members.length; i++)
		{
			if(members[i] != null)
			{
				members[i].showDetails();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("                                  ||| Gym Information |||                            ");
		System.out.println("                            Gym Name: " + name);
		System.out.println("                            <<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>                            ");
		System.out.println("                                  || List of Accounts ||                            ");
		this.showAllAccounts();
		System.out.println("                            <<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>                            ");
		System.out.println();
		System.out.println("                                  || List of Employees ||                            ");
		this.showAllEmployees();
		System.out.println("                            <<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>                            ");
		
	}	
}