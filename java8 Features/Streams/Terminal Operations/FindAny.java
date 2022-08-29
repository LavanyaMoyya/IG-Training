package com.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");

//	String anyElement =list.stream().findAny().get();
	Optional<String>anyElement=list.stream().findAny();
	System.out.println(anyElement.get());
}
}


