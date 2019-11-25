package com.manthan;

public class TestSpeaker {
public static void main(String[] args) {
	Animal a=new Horse();
	Animal m=new Mouse();
	Speaker s=new Speaker();
	s.speak(a);
	s.speak(m);
	s.speak(null);
}
}
