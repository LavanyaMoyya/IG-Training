package com.zone;

import java.time.ZoneId;
import java.util.Set;

public class ZoneDateMultiple {
	public static void main(String[] args) {
		Set<String> zones = ZoneId.getAvailableZoneIds();
		for (String zone : zones) {
			System.out.println(zone);
		}
	}
}
