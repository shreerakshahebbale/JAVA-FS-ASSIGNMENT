package bank;

import java.util.Scanner;

import service.MyBank;

public class BankingApp 
{
	public static void main(String args[]) throws Exception
	{
		Scanner obj = new Scanner(System.in);
		String ch,name;
		int accNo,transAccNo;
		float amount;
		boolean flag=true;
		
		MyBank Bnk = new MyBank();
		do
		{
			System.out.println("Choose Your Appropiate Choice");
			System.out.println("1. Create Account");
			System.out.println("  1.Default Details");
			System.out.println("  2.Name and Amount to Deposit");
			System.out.println("2.Check Account Balance");
			System.out.println("3.Deposit the Amount");
			System.out.println("4.Withdraw the Amount");
			System.out.println("5.Transfer the Amount");
			System.out.println("6.Exit");
			System.out.println("Enter your option");

			ch = obj.nextInt();

			switch(ch)
			{
				case 1:
					
							System.out.println("Enter your choice");
							System.out.println("  1.Display Default Details");
							System.out.println("  2.Name and Amount to Deposit");
							int choice=obj.nextInt();
							switch (choice) {
							case 1:{
										System.out.println("Your Default Account Has Been Created ");
										Bnk.accountCreate();
										break;
									}
							
							
							case 2:{
										System.out.println("To Create Your Account. Plz Enter Your Name and Amount to be Deposited. (Your Deposited Amount should be > 500");
										name = obj.next();
										amount = obj.nextFloat();
										Bnk.accCreate(name,amount);
										break;
									}
							
							default:
										System.out.println("Select the Correct Option");
										break;
						}
						
					
				case 2:
							System.out.println(" Enter Your Account Number");
							accNo = obj.nextInt();
							Bnk.checkBal(accNo);
							break;
							
							
				case 3:
							System.out.println(" Enter Your Account Number");
							accNo = obj.nextInt();
							
							System.out.println("Enter The Amount To Be Deposited");
							amount = obj.nextFloat();
							
							Bnk.deposit(accNo, amount);
							break;
					
							
				case 4:
							System.out.println(" Enter Your Account Number");
							accNo = obj.nextInt();
							
							System.out.println(" Enter The Amount To Be Withdraw");
							amount = obj.nextFloat();
							
							Bnk.withdraw(accNo,amount);
							break;
				
							
				case 5:
							System.out.println(" Enter Your Account Number");
							accNo = obj.nextInt();
							
							System.out.println(" Enter Transfer Account Number");
							transAccNo = obj.nextInt();
							
							System.out.println(" Enter The Amount To Be Transfer");
							amount = obj.nextFloat();
							
							Bnk.transfer(accNo,transAccNo,amount);
							break;
							
							
				case 6:
							System.out.println("Thanks!!! For Choosing Standard Chartered Bank");
							flag=false;
							break;
							
				default:
							System.out.println();
							System.out.println("Please Select the Correct Option");
							break;
			}
		}while(flag);
	}
}