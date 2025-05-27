package classes;
import java.lang.*;

public class Employee
{
	private String empId;
	private String name;
	private String email;
	private double salary;
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getEmpId()
	{
		return empId;
	} 
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public double getSalary()
	{
		return salary;
	}  
	
	public void showDetails()
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Email: " + email);
		System.out.println("Employee Salary: " + salary);
		System.out.println();
	}
}