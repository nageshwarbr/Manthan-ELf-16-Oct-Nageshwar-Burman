package com.manthan;

public class Crush {
void receive(Phone p) {
	if(p instanceof MI){
		System.out.println("D B");
	}
	else if(p instanceof Pixel) {
		System.out.println("TY Dear");
	}
	else if(p instanceof Iphone) {
		System.out.println("ILU");
	}
	else {
		System.out.println("Nonsense");
	}
}
}
