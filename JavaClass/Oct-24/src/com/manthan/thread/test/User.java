package com.manthan.thread.test;

public class User extends Thread{
	PVR p;
	User(PVR ref){
		this.p=ref;
	}
	public void run() {
		p.confirm();
	}
}
