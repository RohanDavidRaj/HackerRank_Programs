package com.hackerrank.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class JustTest {
	
	
	public static void main(String[] args) {
		LinkedHashMap<String, Long> collect = Arrays.stream("abbaa".split("")).collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()))
		;
		collect.entrySet().stream().filter(d->d.getValue()==2).findFirst().ifPresent(System.out::print);
		
	}

}
