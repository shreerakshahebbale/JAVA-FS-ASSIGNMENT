package com;
import java.util.*;
public class SortString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		String[] s=new String[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}

		for(int i = 0; i<s.length-1; i++){  
			for (int j = i+1; j<s.length; j++){   
				if(s[j].compareTo(s[i])>0){   
					String temp = s[i];  
					s[i] = s[j];  
					s[j] = temp;  
				}  
			}  
		}
		System.out.println("Elements in descending order");
		for(String a:s){
			System.out.println(a);
		}
	}
}

