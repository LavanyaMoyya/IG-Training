package com.intermediate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicates {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
	Set<Integer> set = new LinkedHashSet();
	list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
	System.out.println("Unique Values:" + set);   

}
}
