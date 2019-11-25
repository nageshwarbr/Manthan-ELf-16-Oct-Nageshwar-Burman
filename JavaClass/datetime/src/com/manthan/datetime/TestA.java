package com.manthan.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestA {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);

		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
	}

}
