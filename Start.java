import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Gym g = new Gym();
		g.setName("The Muscle Bar");
		
		System.out.println("                            ^^^^^^^^^^^^^^^^^^^^^^^^^                            ");
		System.out.println("                            Welcome to The Muscle Bar                            ");
		System.out.println("                            ^^^^^^^^^^^^^^^^^^^^^^^^^\n                            ");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("                            What do you want to do?\n                            ");
		
			System.out.println("                            1. Employee Management                            ");
			System.out.println("                            2. Member Management                            ");
			System.out.println("                            3. Account Management                            ");
			System.out.println("                            4. Account Transactions                            ");
			System.out.println("                            5. Show Gym Information                            ");
			System.out.println("                            6. Exit                            ");
			
			System.out.println("\n");
			System.out.print("                            Enter your choice:");
			int choice = sc.nextInt();
			System.out.println("");
			
			switch(choice)
			{
				case 1:
					
					System.out.println("                            *************************************                            ");
					System.out.println("                                     Employee Management                            ");
					System.out.println("                            *************************************                            ");
				
					System.out.println("                            What do you want to do?\n                            ");
					
					System.out.println("                            1. Insert New Employee                            ");
					System.out.println("                            2. Remove Employee                            ");
					System.out.println("                            3. Search Employee                            ");
					System.out.println("                            4. Show All Employees                            ");
					System.out.println("                            5. Go Back                            ");
					
					System.out.println("\n");
					System.out.print("                            Enter your option:");
					int option1 = sc.nextInt();
					System.out.println("");
					
					switch(option1)
					{
						case 1:
							
							System.out.println("                            *********************************                            ");
							System.out.println("                                     Insert Employee                            ");
							System.out.println("                            *********************************                            ");						
							System.out.print("                            Enter employee ID: ");
							String id1 = sc.next();
							System.out.print("                            Enter employee Name: ");
							sc.next();
							String name1 = sc.nextLine();
							System.out.print("                            Enter employee Email: ");
							String email1 = sc.next();
							System.out.print("                            Enter employee salary: ");
							double salary = sc.nextDouble();
							
							Employee E1 = new Employee();
							E1.setEmpId(id1);
							E1.setName(name1);
							E1.setEmail(email1);
							E1.setSalary(salary);
							
							if(g.insertEmployee(E1))
							{
								System.out.println("                            Employee Inserted, ID : " + E1.getEmpId() + " ");
							}
							else
							{
								System.out.println("                            Employee NOT Inserted, ID : " + E1.getEmpId() + "");
							}
								
							break;

							case 2:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                     Remove Employee                          ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter the ID to remove a member: ");
							String id2 = sc.next();
							
							Employee E2 = g.searchEmployee(id2);
							
							if(E2 != null)
							{
								System.out.println("                            || Employee Found ||                            ");
								
								if(g.removeEmployee(E2))
								{
									System.out.println("                            Employee Removed, ID : " + E2.getEmpId() + "  ***");
								}
							}
							else
							{
								System.out.println("                            || Employee NOT Found ||                            ");
							}
								
							break;
							
						case 3:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                     Search Employee                            ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter the ID to search a Employee: ");
							String id3 = sc.next();
							
							Employee E3 = g.searchEmployee(id3);
							
							if(E3 != null)
							{
								System.out.println("                            || Employee Found ||                            ");
								E3.showDetails();
							}
							else
							{
								System.out.println("                            || Employee NOT Found ||                            ");
							}
							
							break;
							
						case 4:
						
							System.out.println("                            **********************************                            ");
							System.out.println("                                    Show All Employees                            ");
							System.out.println("                            **********************************                            ");
							
							g.showAllEmployees();
							
							break;
							
						case 5:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                      Go Back---                            ");
							System.out.println("                            *******************************                            ");
							
							break;
							
						default:
							
							System.out.println("                            ********************************                            ");
							System.out.println("                            Invalid Option--- Going Back ---                            ");
							System.out.println("                            ********************************                            ");
							break;
					}
							
					break;
					
				case 2:
					
					System.out.println("                            ***********************************                            ");
					System.out.println("                                     Member Management                            ");
					System.out.println("                            ***********************************                            ");
					
					System.out.println("                            What do you want to do?\n                            ");
					
					System.out.println("                            1. Insert New Member                            ");
					System.out.println("                            2. Remove Member                           r");
					System.out.println("                            3. Search Member                            ");
					System.out.println("                            4. Show All Members                            ");
					System.out.println("                            5. Go Back                            ");
					
					System.out.println("\n");
					System.out.print("                            Enter your option:");
					int option2 = sc.nextInt();
					System.out.println("");
					
					switch(option2)
					{
						case 1:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                    Insert Member                            ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter Member ID: ");
							int id1 = sc.nextInt();
							System.out.print("                            Enter Member Name: ");
							String name1 = sc.next();
							System.out.print("                            Enter Member DOB: ");
							String dob1 = sc.next();
							System.out.print("                            Enter Member Phone Number: ");
							String phnNumber1 = sc.next();
							System.out.print("                            Enter Member Email: ");
							String email1 = sc.next();
							
							Member m1 = new Member();
							m1.setId(id1);
							m1.setName(name1);
							m1.setDob(dob1);
							m1.setPhnNumber(phnNumber1);
							m1.setEmail(email1);
							
							if(g.insertMember(m1))
							{
								System.out.println("                            Member Inserted, ID : " + m1.getId() + " ");
							}
							else
							{
								System.out.println("                            Member NOT Inserted, ID : " + m1.getId() + "");
							}
								
							break;
							
						case 2:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                     Remove Member                            ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter the ID to remove a member: ");
							int id2 = sc.nextInt();
							
							Member m2 = g.searchMember(id2);
							
							if(m2 != null)
							{
								System.out.println("                            || Member Found ||                            ");
								
								if(g.removeMember(m2))
								{
									System.out.println("                            Member Removed, ID : " + m2.getId() + "  ***");
								}
							}
							else
							{
								System.out.println("                            || Member NOT Found ||                            ");
							}
								
							break;
							
						case 3:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                     Search Member                            ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter the ID to search a member: ");
							int id3 = sc.nextInt();
							
							Member E3 = g.searchMember(id3);
							
							if(E3 != null)
							{
								System.out.println("                            || Member Found ||                            ");
								E3.showDetails();
							}
							else
							{
								System.out.println("                            || Member NOT Found ||                            ");
							}
							
							break;
							
						case 4:
						
							System.out.println("                            **********************************                            ");
							System.out.println("                                    Show All Members                            ");
							System.out.println("                            **********************************                            ");
							
							g.showAllMembers();
							
							break;
							
						case 5:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                      Go Back---                            ");
							System.out.println("                            *******************************                            ");
							
							break;
							
						default:
							
							System.out.println("                            ********************************                            ");
							System.out.println("                            Invalid Option--- Going Back ---                            ");
							System.out.println("                            ********************************                            ");
							break;
					}
					
					break;
					
				case 3:
					
					System.out.println("                            ************************************                            ");
					System.out.println("                                     Account Management                            ");
					System.out.println("                            ************************************                            ");
				
					System.out.println("                            What do you want to do?\n");
					
					System.out.println("                            1. Insert New Account                            ");
					System.out.println("                            2. Remove Account                            ");
					System.out.println("                            3. Search Account                            ");
					System.out.println("                            4. Show All Accounts                            ");
					System.out.println("                            5. Go Back                            ");
					
					System.out.println("\n");
					System.out.print("                            Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("\n");
					
					switch(option3)
					{
						case 1:
							
							System.out.println("                            ********************************                            ");
							System.out.println("                                     Insert Account                            ");
							System.out.println("                            ********************************                            ");
							
							
							System.out.print("                            Enter the ID to verify a member: ");
							int id1 = sc.nextInt();
							
							Member m1 = g.searchMember(id1);
							
							if(m1 != null)
							{
								System.out.println("                            || Member Verified ||                            ");
								
								Account a = null;
								
								if(a!= null)
								{
									if(g.insertAccount(a))
									{
										System.out.println("                            Account Inserted, Account Number: " + a.getAccountNumber() + "");
									}
									else
									{
										System.out.println("                            Account Inserted, Account Number: " + a.getAccountNumber() + "");
									}
								}	
							}
							else
							{
								System.out.println("                            Invalid Member--- Can NOT create Account                            ");
							}
							
							break;


							case 2:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                     Remove Account                           ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter the Account Number to remove an Account: ");
							String acN = sc.next();
							
							Account A1 = g.searchAccount(acN);
							
							if(A1 != null)
							{
								System.out.println("                            || Account Found ||                            ");
								
								if(g.removeAccount(A1))
								{
									System.out.println("                            Member Removed, ID : " + A1.getAccountNumber() + "  ***");
								}
							}
							else
							{
								System.out.println("                            || Member NOT Found ||                            ");
							}
								
							break;
							
						case 3:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                     Search Account                            ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter The Account Number you want to search: ");
							String acN2 = sc.next();
							
							Account A2 = g.searchAccount(acN2);
							
							if(A2 != null)
							{
								System.out.println("                            || Account Found ||                            ");
								A2.showDetails();
							}
							else
							{
								System.out.println("                            || Account NOT Found ||                            ");
							}
							
							break;
							
						case 4:
						
							System.out.println("                            **********************************                            ");
							System.out.println("                                    Show All Accounts                            ");
							System.out.println("                            **********************************                            ");
							
							g.showAllAccounts();
							
							break;
							
						case 5:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                      Go Back---                            ");
							System.out.println("                            *******************************                            ");
							
							break;
							
						default:
							
							System.out.println("                            ********************************                            ");
							System.out.println("                            Invalid Option--- Going Back ---                            ");
							System.out.println("                            ********************************                            ");
							break;
							
					}
				
					 break;
					
				case 4:
					
					System.out.println("                            ************************************************                            ");
					System.out.println("                                     Account Transaction Management                            ");
					System.out.println("                            ************************************************                            ");
					
					System.out.println("                            What do you want to do?\n                            ");
					
					System.out.println("                            1. Deposit Monthly Fees                         ");
					System.out.println("                            2. Payment History                            ");
					System.out.println("                            3. Go Back                            ");
					
					System.out.println("\n");
					System.out.print("                            Enter your option: ");
					int option4 = sc.nextInt();
					System.out.println("\n");
					
					switch(option4)
					{
						case 1:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                    Deposit Fees                            ");
							System.out.println("                            *******************************                            ");
							
							System.out.print("                            Enter Account Number for Verification: ");
							String an1 = sc.next();
							
							Account a1 = g.searchAccount(an1);
							
							if(a1 != null)
							{
								System.out.println("                            || Account Verified ||                            ");
								System.out.println("                            Account Number: " + a1.getAccountNumber());
								System.out.println("                            Member's Name: " + a1.getMember().getName());
								
								System.out.println("                            Current Balance: " + a1.getBalance());
								System.out.print("                            Deposit Amount: ");
								double am = sc.nextDouble();
								
								if(a1.depositMoney(am))
								{
									System.out.println("                            || Deposit Successfull ||                            ");
									System.out.println("                            New Balance: " + a1.getBalance());
									frwd.writeInFile(am + "                             Deposited in " + a1.getAccountNumber());
								}
								else
								{
									System.out.println("                            || Deposit Failed ||                            ");
								}
							}
							else
							{
								System.out.println("                            Invalid Account... Can NOT Deposit Fees                            ");
							}
							
							
							break;
							
						case 2:
							
							
							
						
							
							System.out.println("                            *************************************                            ");
							System.out.println("                                     Transaction History                            ");
							System.out.println("                            *************************************                            ");
							
							frwd.readFromFile();
							
							break;
							
						case 3:
							
							System.out.println("                            *******************************                            ");
							System.out.println("                                       Go Back---                            ");
							System.out.println("                            *******************************                            ");
							
							break;
							
						default:
							
							System.out.println("                            ********************************                            ");
							System.out.println("                            Invalid Option--- Going Back ---                            ");
							System.out.println("                            ********************************                            ");
							break;
					}
					
					break;
					
				case 5:
				
					System.out.println("                            ***********************************                            ");
					g.showDetails();
					System.out.println("                            ***********************************                            ");
					
					break;
					
				case 6:
					
					repeat = false;
					System.out.println("                            ***********************************                            ");
					System.out.println("                                         Thank You                            ");
					System.out.println("                            ***********************************                            ");
					
					break;
				
				default:
					
					System.out.println("                            *******************************                            ");
					System.out.println("                            Invalid Choice--- Try Again ---                            ");
					System.out.println("                            *******************************                            ");
					
					break;
			}
		}		
	}
}