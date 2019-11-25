package com.manthan;

public class Speaker {
void speak(Animal a) {
	if(a instanceof Mouse) {
		System.out.println("Mouse sound");
	}
	else if(a instanceof Horse) {
		System.out.println("Neigh");
	}
	else {  
		System.out.println("No animal");
	}
}
}
