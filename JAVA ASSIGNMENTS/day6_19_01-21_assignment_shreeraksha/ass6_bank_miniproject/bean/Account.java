package bean;
import java.util.Scanner;
public class Account{
	Scanner sc=new Scanner(System.in);
	private int accno;
	private String name;
	private int amount;
	public Account() {
		
	}
	public Account(int accno,String name,int amount) {
		this.accno=accno;
		this.name=name;
		this.amount=amount;	
	}
	public void showAccount() {
		System.out.println(accno);
		System.out.println(name);
		System.out.println(amount);
		System.out.println("Account created successfully");	
	}
	public boolean search(int acc){
		if(accno==acc) {
			return(true);	
		}
		return(false);
	}
	public Account(int accno) {
		this.accno=accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}		
}