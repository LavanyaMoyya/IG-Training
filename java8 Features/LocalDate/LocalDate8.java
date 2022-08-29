package com.localdate;

import java.time.LocalDate;

public class LocalDate8 {
	public static void main(String[] args) {

		LocalDate currDate = LocalDate.now();
		System.out.println("Current Date :" + currDate);
		System.out.println("Length of Month :" + currDate.lengthOfMonth());
		System.out.println("Length of Year :" + currDate.lengthOfYear());
	}
}
