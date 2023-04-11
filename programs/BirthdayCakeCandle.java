package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BirthdayCakeCandle {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(7);
		
		Map<Object, Long> collect = list.stream().collect
		(Collectors.groupingBy(a->a,TreeMap::new,Collectors.counting()));

		
		System.out.println(collect.entrySet().stream().skip(collect.size()-1).findFirst().get().getValue().intValue());
	
		
				}

}
