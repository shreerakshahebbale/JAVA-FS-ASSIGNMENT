package Main;
import java.util.Scanner;
import service.MyBank;
public class BankTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyBank a=new MyBank();
		System.out.println("Welcome to HDFC Bank");
		do {
			System.out.println("1.Create bank account");
			System.out.println("2.Withdraw");
			System.out.println("3.Deposit");
			System.out.println("4.CheckBalance");
			System.out.println("5.Amount transfer");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:System.out.println("1.default account");
					   System.out.println("2.Account with name and amount");
					   System.out.println("Enter your choice");
					   int c=sc.nextInt();
					   if(c==1) {
						   a.accountCreate();
					   }
					   else {
						   System.out.println("Enter your name");
						   String name=sc.next();
						   System.out.println("Enter the amount");
						   int amount=sc.nextInt();
						   if(amount<500) {
						   System.out.println("Minimum balance should be 500");
						   }
						   else
							   a.accountCreate(name,amount);
					   }
					   break;
				case 2:System.out.println("Enter account number");
					   int  accno=sc.nextInt();
					   a.search(accno);
					   System.out.println("Enter amount to be withdrawn");
					   int amount=sc.nextInt();
					   a.withdraw(accno, amount);
					   break;
				case 3:System.out.println("Enter the account number");
					   accno=sc.nextInt();
					   a.search(accno);
					   System.out.println("Enter amount to be deposited");
					   amount=sc.nextInt();
					   a.deposit(accno,amount);
					   break;
				case 6:System.out.println("Enter account number");
						accno=sc.nextInt();
						a.search(accno);
						a.checkBalance(accno);
				case 5:System.out.println("Enter the account you would like to transfer money from:");
					   int fromaccno=sc.nextInt();
					   a.search(fromaccno);
					   System.out.println("Enter the account you would like to transfer money to:");
					   int toaccno=sc.nextInt();
					   a.search(toaccno);
					   System.out.println("Enter amount to be transferred");
					   amount=sc.nextInt();
					   a.transfer(fromaccno,toaccno,amount);
					 
			}
			
		}while(true);
		
		}
	
}
