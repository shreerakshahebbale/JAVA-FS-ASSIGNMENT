import java.util.*;
class EmployeeDetail{
	public static void main(String[] args){
		int id[]=new int[20];
		String name[]=new String[20];
		double salary[]=new double[10];
		String des[]=new String[15];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of recorded to inserted");
		int n=sc.nextInt();
		System.out.println("Enter employee details");
		for(int i=0;i<n;i++){
			System.out.println("enter employee "+(i+1)+" records ");
			System.out.println("Enter id of the employee");
			id[i]=sc.nextInt();
			System.out.println("Enter name of the employee");
			name[i]=sc.next();
			System.out.println("Enter salary of the employee"); 
			salary[i]=sc.nextDouble();
			System.out.println("Enter the designation");
			des[i]=sc.next();
		}
		double bonus,pf,hra,da;
		for(int i=0;i<n;i++){
			if(des[i].equals("Manager")){
				bonus=salary[i]*15/100;
			}
			else if(des[i].equals("Developer")){
				bonus=salary[i]*5/100;
			}
			else{
				bonus=salary[i]*5/100;
			}
			hra=salary[i]*10/100;
			da=salary[i]*7/100;
			pf=salary[i]*5/100;
			salary[i]=salary[i]+hra+da+bonus-pf;
		}

		for(int i=0;i<n;i++){
			System.out.println(id[i]);
			System.out.println(name[i]);
			System.out.println(salary[i]);
			System.out.println(des[i]);
		}
	}
}

