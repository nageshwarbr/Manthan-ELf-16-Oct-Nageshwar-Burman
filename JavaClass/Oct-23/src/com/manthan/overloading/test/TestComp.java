package com.manthan.overloading.test;

public class TestComp {
	public static void main(String[] args) {
		Room.computer.on();
		Room.cost=15000;
		System.out.println(Room.cost);
		Room room=new Room();
		room.run();
	}
}
