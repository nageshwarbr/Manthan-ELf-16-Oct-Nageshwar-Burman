package com.manthan.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestD {
public static void main(String[] args) {
	
	FileInputStream fin;
	try {
		fin = new FileInputStream("vikas.txt");
		
		int m;
		while((m=fin.read())!=-1) {
			System.out.print((char)m);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
}

