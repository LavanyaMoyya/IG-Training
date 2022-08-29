package com.zone;

import java.time.ZoneId;

public class ZoneIdSystemDefault {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
	}
}
