package com.localdate;

import java.time.LocalDate;

public class LocalDate4 {
	public static void main(String[] args) {

		LocalDate currDate = LocalDate.now();
		LocalDate yesterday = currDate.minusDays(1);
		LocalDate tomorrow = currDate.plusDays(1);
		System.out.println("Current Date :" + currDate);
		System.out.println("Yesterday :" + yesterday);
		System.out.println("Tomorrow :" + tomorrow);
	}
}
