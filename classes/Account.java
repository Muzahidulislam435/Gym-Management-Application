package classes;

import java.lang.*;
import interfaces.AccountTransactions;

public abstract class Account implements AccountTransactions
{	
	private String accountNumber;
	private double balance;
	private Member member;
	
	public Account(){ }
	public Account(String accountNumber, Member member, double balance)
	{
		this.accountNumber = accountNumber;
		this.member = member;
		this.balance = balance;
	}
	
	public void setAccountNumber(String accountNumber)
	{ 
	    this.accountNumber = accountNumber;
	}
	public void setMember(Member member)
	{
		this.member = member;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public Member getMember()
	{
		return member;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public abstract void showDetails();
	
	public boolean depositMoney(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			return true;
		}
		return false;
	}
	public boolean withdrawMoney(double amount)
	{
		if(amount>0 && amount<= balance)
		{
			balance = balance - amount;
			return true;
		}
		return false;
	}
}