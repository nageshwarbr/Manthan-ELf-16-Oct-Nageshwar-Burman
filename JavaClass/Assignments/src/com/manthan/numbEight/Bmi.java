package com.manthan.numbEight;

public class Bmi {
double weight;
double height;
public Bmi(double weight,double height) {
	this.weight = weight;
	this.height=height;
}
@Override
public String toString() {
	return "weight=" + weight + ", height=" + height + "\n";
}


}
