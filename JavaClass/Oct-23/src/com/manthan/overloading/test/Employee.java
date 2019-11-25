package com.manthan.overloading.test;

import java.io.Serializable;

public class Employee implements Serializable{
private char gender;
private int id;
private String name;
double height;
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}


}
