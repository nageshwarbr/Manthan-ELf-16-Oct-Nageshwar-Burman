package com.manthan.usecase.test;

import java.util.Scanner;

public class RunApplication {
public static void main(String[] args) {
	Homepage homepage=new Homepage();

	Scanner scan=new Scanner(System.in);

	do {
		homepage.home();
	}
	while(scan.nextInt()!=5);
}
}
