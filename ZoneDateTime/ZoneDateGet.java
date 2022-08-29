package com.zone;

import java.time.ZonedDateTime;

public class ZoneDateGet {
	public static void main(String[] args) {
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone.getZone());
	}
}