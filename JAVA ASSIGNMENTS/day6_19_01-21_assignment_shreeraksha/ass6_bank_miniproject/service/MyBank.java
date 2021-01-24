package service;
import bean.Account;
import java.util.Scanner;
class AccountNotFoundException extends Exception{
	AccountNotFoundException(){
		super();
	}
	AccountNotFoundException(String msg){
		super(msg);
	}	
}
class MinimumBalanceException extends Exception{
	MinimumBalanceException(){
		super();
	}
	MinimumBalanceException(String msg){
		super(msg);
	}
}
abstract class AccountInitialization{
static int accountCount=0;
int accountno=100;
int balance=500;
Account accounts[]=new Account[10];
Scanner sc=new Scanner(System.in); 
	public void accountCreate(){
		Account acc=new Account(accountno,"unknown",500);
		accounts[accountCount]=acc;
		accountCount++;
		acc.showAccount();
		accountno++;	
	}
	public void accountCreate(String name,int amount) {
		Account a=new Account(accountno);
		a.setName(name);
		a.setAmount(amount);
		Account acc=new Account(accountno,name,amount);
		accounts[accountCount]=acc;
		accountCount++;
		acc.showAccount();
		accountno++;
		balance=amount;
	}
	public void search(int accno) {
		boolean found = false; 
		try {
    for (int i = 0; i < accounts.length; i++) {
       try {
    	found = accounts[i].search(accno);
    	}
       catch(NullPointerException e) {
       }
        if (!found) {
        	throw new AccountNotFoundException("Account Not found");     	
        }
     break;
     }
    }
      catch(Exception e) {
    	  System.out.println("catch block");
    	  System.out.println(e.toString());
    	  System.exit(0);
      }
		}
    
	abstract void transfer(int fromaccno,int toaccno,int amount);
}
interface Bank{
	void withdraw(int accno,int amount);
	void deposit(int accno,int amount);
	void checkBalance(int accno);
}
public class MyBank extends AccountInitialization implements Bank{
	public void withdraw(int accno,int amount) {
		try{
			if(balance-amount<500)
				throw new MinimumBalanceException("Insufficient balance");
			else {
            balance = balance - amount;
             System.out.println("Please collect your cash");
             System.out.println("Your account balance is"+balance);
        }}
       catch(Exception e) {
    	   System.out.println(e.toString());
       }
	}
    public void deposit(int accno,int amount) {
    	balance=balance+amount;
    	System.out.println("An amount of INR"+amount+"has been credited to your account"+accno+"Total Availbal INR"+balance);
		
	}
	public void checkBalance(int accno) {
		System.out.println("Your account balance is"+balance);	
	}
public void transfer(int fromaccno,int toaccno,int amount) {

for(Account account:accounts) {
		
	}
	
	
}
}

