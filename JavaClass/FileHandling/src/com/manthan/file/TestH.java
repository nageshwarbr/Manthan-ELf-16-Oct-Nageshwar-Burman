package com.manthan.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestH {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("myDBConfig.properties");
			Properties pr=new Properties();
			pr.load(fin);
			
			String url=pr.getProperty("user");
			String user=pr.getProperty("url");
			System.out.println(url);
			System.out.println(user);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
