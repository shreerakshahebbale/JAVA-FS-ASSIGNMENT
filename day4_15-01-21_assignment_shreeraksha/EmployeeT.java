import java.util.*;
class Employee{
	int id;
	String name;
	double salary; 
	Scanner sc=new Scanner(System.in);
	Address add=new Address();

void read(){
	System.out.println("Enter employee ID");
	int id=sc.nextInt();
	System.out.println("Enter employee name");
	String name=sc.next();
	System.out.println("Enter employee salary");
	double salary=sc.nextDouble();
}
void calSalary(){
	double pf,hra,da;
	hra=salary*10/100;
	da=salary*7/100;
	pf=salary*5/100;
	salary=salary+hra+da-pf;
}
void display(){
	System.out.println("Employee ID is"+id);
	System.out.println("Employee name is"+name);
	System.out.println("Employee salary is"+salary);

}
}
class Manager extends Employee{
	int n;
	Scanner sc=new Scanner(System.in);
void readMgr(){
	System.out.println("Enter number of employees working under Manager");
	n=sc.nextInt();
add.readAdd();
}

void disMgr(){
	System.out.println("Number of employees working under manager are"+n);
}
}
class Programmer extends Employee{
Scanner sc=new Scanner(System.in);
	String projectName;
void readProg(){
	System.out.println("Enter project Name");
	projectName=sc.next();
add.readAdd();
} 

void disProg(){
	System.out.println("Programmer working under"+projectName);
	}
}
class Address{
Scanner sc=new Scanner(System.in);
	String city,state;
	int pincode;
void readAdd(){
	System.out.println("Enter city");
	city=sc.next();
	System.out.println("Enter state");
	state=sc.next();
	System.out.println("Enter pincode");
	pincode=sc.nextInt();
}
void dispAddress(){
	System.out.println("city is"+city);
	System.out.println("state is"+state);
	System.out.println("pincode is"+pincode);
}
}


class EmployeeT{
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

}

}
