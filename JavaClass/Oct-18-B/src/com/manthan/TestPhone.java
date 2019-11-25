package com.manthan;

public class TestPhone {
public static void main(String[] args) {
	Phone mi=new MI();
	Phone p=new Pixel();
	Phone i=new Iphone();
	Crush crush=new Crush();
	crush.receive(null);
	crush.receive(i);
	crush.receive(mi);
	crush.receive(p);
}
}
