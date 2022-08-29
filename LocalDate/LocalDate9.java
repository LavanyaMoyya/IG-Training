package com.localdate;

import java.time.LocalDate;

public class LocalDate9 {
	public static void main(String[] args) {

		LocalDate currDate = LocalDate.now();
		System.out.println(currDate + " is a leap year = " + currDate.isLeapYear());
	}
}
