package com.manthan.exception.test;

import java.io.IOException;
import java.sql.SQLException;

public class TestDemo {
	public static void main(String[] args) {
		Demo demo=new Demo();
		try {
			demo.run();
		} catch (IOException|SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
