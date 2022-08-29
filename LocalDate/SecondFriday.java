package com.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondFriday {
	public static void main(String[] args) {
		/*
		 * LocalDate current = LocalDate.now(ZoneId.of("Pacific/Easter")); LocalDate
		 * secondFridayOfNextMonth = current.plusMonths(1)
		 * .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
		 * System.out.println("2nd Friday of next month is " + secondFridayOfNextMonth);
		 */
		LocalDate date1 = LocalDate.now();
		LocalDate firstInYear = LocalDate.of(date1.getYear(), date1.getMonth(), 1);
		System.out.println(firstInYear);
		LocalDate secondFriday = firstInYear.plusMonths(1).with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
				.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

		System.out.println("Second Friday on : " + secondFriday);

	}
}
