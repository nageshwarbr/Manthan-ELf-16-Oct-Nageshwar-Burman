package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class Testg {
public static void main(String[] args) {
	System.out.println("Main started");
	File f=new File("m:/burman.txt");
	try {
		f.createNewFile();
		System.out.println("File created");
	}
	catch(IOException i) {
		System.out.println("file  not created");
	}
	System.out.println("Main ended");
}
}
