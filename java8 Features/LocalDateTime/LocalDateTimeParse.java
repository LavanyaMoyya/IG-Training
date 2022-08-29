package com.localdate;

import java.time.LocalDateTime;

public class LocalDateTimeParse {
	public static void main(String[] args) {
		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime dt1 = LocalDateTime.of(2022, 8, 23, 5, 50);
		LocalDateTime dt2 = LocalDateTime.parse("2022-08-25T05:50");
		System.out.println(currDateTime);
		System.out.println(dt1);
		System.out.println(dt2);
	}
}
