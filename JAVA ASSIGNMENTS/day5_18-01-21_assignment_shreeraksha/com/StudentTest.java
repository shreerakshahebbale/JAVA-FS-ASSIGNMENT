package com;
import java.util.*;
	class Student{
	Scanner sc=new Scanner(System.in);
	int sid;
	String sname;
	int age;
	int[] marks=new int[4];	
	String grade;
	void read(){
		System.out.println("Enter student id");
		sid=sc.nextInt();
		System.out.println("Enter student name");
		sname=sc.next();
		System.out.println("Enter student age");
		age=sc.nextInt();
		for(int i=0;i<marks.length;i++){
			System.out.println("Enter marks scored in subject "+(i+1));
			marks[i]=sc.nextInt();
		}
	}
	void calculateGrade(){
		int total=0;
		int avg;
		for(int i=0;i<marks.length;i++){
			total=marks[i]+total;
		}
		avg=total/marks.length;
		if(avg>90)
			grade="A+";
		else if(avg>80)
			grade="A";
		else if(avg>70)
			grade="B";
		else if(avg>55)
			grade="C";
		else
			grade="D";
	}
	void display(){
		System.out.println("Student id is "+sid);
		System.out.println("Student name is "+sname);
		System.out.println("student age is "+age);
		System.out.println("Student grade is "+grade);
	}
}
class StudentTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of students");
	        n=sc.nextInt();
		Student std[]=new Student[n];
		for(int i=0;i<n;i++){
			std[i]=new Student();
			std[i].read();
		}
		for(int i=0;i<n;i++){
			std[i].calculateGrade();
		}
		for(int i=0;i<n;i++){
			std[i].display();
		}
	}
}


