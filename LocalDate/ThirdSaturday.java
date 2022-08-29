package com.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class ThirdSaturday {
	public static void main(String[] args) {

		YearMonth ym = YearMonth.of(2022, Month.MAY);
		LocalDate d3 = ym.atDay(1).with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.SATURDAY));
		System.out.println(d3);
	}
}
