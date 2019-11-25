package com.manthan.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		
		String msg="Hi how are you?";
		byte[] b=msg.getBytes();
		try(FileOutputStream fout=new FileOutputStream("qspiders.txt")) {
			
			fout.write(b);
			System.out.println("Done");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
