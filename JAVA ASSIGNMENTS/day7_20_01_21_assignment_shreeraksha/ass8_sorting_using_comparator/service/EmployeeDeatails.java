package service;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import bean.Employee;
import bean.SortbyId;
import bean.SortbyName;
import bean.SortbySalary;
 class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice,n;
		int id;
		String name;
		int salary;
		System.out.println("Enter the number of employees ");
		n=sc.nextInt();
		ArrayList<Employee>e=new ArrayList<Employee>();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the id of employee "+i);
			id=sc.nextInt();
			System.out.println("Enter the name of the employee "+i);
			sc.nextLine();
			name=sc.nextLine();
			
			System.out.println("Enter the salary of the employees "+i);
			salary=sc.nextInt();
		e.add(new Employee(id,name,salary));
		}
			System.out.println("Enter your option:");
			System.out.println("sort id");
			System.out.println("sort name");
			System.out.println("sort salary");
			choice=sc.nextInt();
			switch (choice)
			{  
			case 1:
				Collections.sort(e, new SortbyId());
				 
		        System.out.println("\nSorted by id");
		        for (int i=0; i<e.size(); i++)
		            System.out.println(e.get(i));
		        break;
			case 2:
				Collections.sort(e, new SortbyName());
				 
		        System.out.println("\nSorted by name");
		        for (int i=0; i<e.size(); i++)
		            System.out.println(e.get(i));
		        break;
			case 3:
				Collections.sort(e, new SortbySalary());
				 
		        System.out.println("\nSorted by salary");
		        for (int i=0; i<e.size(); i++)
		            System.out.println(e.get(i));
		        break;
		   default:
			   System.out.println("Invalid  option:");
			   break;
			   
			}
		
	

}
 }