package com.manthan.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestB {
public static void main(String[] args) {
	LocalDate  ld=LocalDate.now();
	
	LocalDateTime ldt=LocalDateTime.now();
	
	DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	System.out.println(dt.format(ld));
	
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy h:m a");
	
	String res=dtf.format(ldt);
	
	System.out.println(res);
}
}
