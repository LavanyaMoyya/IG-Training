package com.zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateOf {
	public static void main(String[] args) {
		ZoneId india = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1 = ZonedDateTime.now(india);
		System.out.println("In India Central Time Zone: " + zone1);
	}
}
