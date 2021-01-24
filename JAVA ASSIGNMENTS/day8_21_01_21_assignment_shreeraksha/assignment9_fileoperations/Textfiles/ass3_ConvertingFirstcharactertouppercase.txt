package com;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
public class UpperCaseOfSentence{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\shreeraksha\\Desktop\\hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		String out=" ";
        	while ((line = br.readLine()) !=null) {
        		String words[]=line.split(" ");
        		for(String word:words)
          	    out  =out+Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
         	br.close();
		fr.close();
		System.out.println(out);
	}
}

