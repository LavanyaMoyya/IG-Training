package com.zone;

import java.time.ZoneOffset;

public class ZoneOffsetHoursMin {
	public static void main(String[] args) {
		ZoneOffset zone = ZoneOffset.ofHoursMinutes(5, 30);
		System.out.println(zone);
	}
}
