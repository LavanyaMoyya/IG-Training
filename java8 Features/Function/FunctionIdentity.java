package com.function;

import java.util.function.Function;

public class FunctionIdentity {
	public static void main(String[] args) {
		System.out.println(Function.identity().apply(10));
		System.out.println(Function.identity().apply("Peter"));
	}
}
