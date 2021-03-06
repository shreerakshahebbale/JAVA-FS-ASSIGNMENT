import java.util.*;
class Employee{
	int id;
	String name;
	double salary; 
	Scanner sc=new Scanner(System.in);
	Address add=new Address();
        void read(){
		System.out.println("Enter ID");
          	id=sc.nextInt();
          	sc.nextLine();
	  	System.out.println("Enter Name");
	  	name=sc.nextLine();
	  	System.out.println("Enter Salary");
	  	salary=sc.nextDouble();
        }
      	void calSalary(){
    	  	double pf,hra,da;
    	  	hra=salary*10/100;
    	  	da=salary*7/100;
    	  	pf=salary*5/100;
    	  	salary=salary+hra+da-pf;
      	}
      	void display(){
    	  	System.out.println("-------------------------------------------------");
    	  	System.out.println("Employee ID is "+id);
    	  	System.out.println("Employee name is "+name);
    	  	System.out.println("Employee salary is "+salary);
    	  	System.out.println("-------------------------------------------------");
      	}
}
class Manager extends Employee{
	int n;
	void readMgr(){
		System.out.println("Enter number of employees working under Manager");
		n=sc.nextInt();
		sc.nextLine();
		add.readAdd();
	}

	void disMgr(){
		System.out.println("Number of employees working under manager are"+n);
		add.dispAdd();
	}
}
class Programmer extends Employee{
	String projectName;
	void readProg(){
		System.out.println("Enter project Name");
		projectName=sc.nextLine();
		add.readAdd();
	} 
	

	void disProg(){
		System.out.println("Programmer working under"+projectName);
		add.dispAdd();
	}
}
class Address{
	Scanner sc=new Scanner(System.in);
	String city,state;
	int pincode;
	void readAdd(){
		
		System.out.println("Enter city");
		city=sc.nextLine();
		System.out.println("Enter state");
		state=sc.nextLine();
		System.out.println("Enter pincode");
		pincode=sc.nextInt();
	}
	void dispAdd(){
		System.out.println("--------------------------------------------");
		System.out.println("city is "+city);
		System.out.println("state is "+state);
		System.out.println("pincode is "+pincode);
		System.out.println("--------------------------------------------");
	}
}

class EmployeeTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the manager details");
		Manager mgr=new Manager();
		mgr.read();
		mgr.readMgr();
		System.out.println("Enter programmer details");
		Programmer prg=new Programmer();
		prg.read();
		prg.readProg();
		mgr.calSalary();
		prg.calSalary();
		mgr.display();
		mgr.disMgr();
		prg.display();
		prg.disProg();
	}

}

