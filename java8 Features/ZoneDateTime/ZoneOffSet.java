package com.zone;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class ZoneOffSet {
	public static void main(String[] args) {
		ZoneOffset zone = ZoneOffset.UTC;
		Temporal temp = zone.adjustInto(ZonedDateTime.now());
		System.out.println(temp);
	}
}
