package com.localdate;

import java.time.LocalDate;

public class LocalDate7 {
	public static void main(String[] args) {

		LocalDate currDate = LocalDate.now();
		LocalDate tomorrow = currDate.plusDays(1);
		LocalDate yesterday = currDate.minusDays(1);
		System.out.println("Current Date is after yesterday date :" + currDate.isAfter(yesterday));
		System.out.println("Current Date is after tomorrow date :" + currDate.isBefore(tomorrow));
	}
}
