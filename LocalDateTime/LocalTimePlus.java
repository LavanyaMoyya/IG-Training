package com.localdate;

import java.time.LocalTime;

public class LocalTimePlus {
	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = t1.plusHours(2);
		LocalTime t3 = t1.minusHours(2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
