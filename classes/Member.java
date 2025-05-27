package classes;
import java.lang.*;

public class Member
{
	private int id;
	private String name;
	private String dob;
	private String phnNumber;
	private String email;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
    }
	public String getDob()
	{
		return dob;
    }
	public String getPhnNumber()
	{
		return phnNumber;
	}
	public String getEmail()
	{
		return email;
	}
	
	public void showDetails()
	{
		System.out.println("-------------------------------------");
		System.out.println("Membership Id: " + id);
		System.out.println("Member's Name: " + name);
		System.out.println("Member's Dob: " + dob);
		System.out.println("Member's Phone Number: " + phnNumber);
		System.out.println("Member's Email: " + email);
		System.out.println();
	}
}