package com.localdate;

import java.time.LocalDateTime;

public class LocalDatePlus {
	public static void main(String[] args) {
		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime dt1 = currDateTime.plusDays(10);
		LocalDateTime dt2 = currDateTime.minusHours(2);
		System.out.println(currDateTime);
		System.out.println(dt1);
		System.out.println(dt2);
	}
}
