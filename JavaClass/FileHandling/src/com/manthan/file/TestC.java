package com.manthan.file;

import java.io.FileWriter;
import java.io.IOException;

public class TestC {
public static void main(String[] args) {
	String mesg="Have a good day";
	char[] ch=mesg.toCharArray();
	
	
	try {
		FileWriter fw = new FileWriter("divya.txt");
		fw.write(ch);
		fw.flush();
		System.out.println("Done");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
}
