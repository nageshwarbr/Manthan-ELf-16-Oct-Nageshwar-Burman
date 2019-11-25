package com.manthan.thread.test;

public class TestPVruser {

	public static void main(String[] args) {
		PVR p=new  PVR();
		PVR p1=new  PVR();
		User user=new User(p);
		User user1=new User(p);
		user.start();
		
	}

}
