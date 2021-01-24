package com;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
public class WordCount {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\shreeraksha\\Desktop\\hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		int count=0;
        	while ((line = br.readLine()) !=null) {
          		String words[]=line.split(" ");
          		count=count+words.length;
		}
         	fr.close();
		System.out.println(count);
	}
}


