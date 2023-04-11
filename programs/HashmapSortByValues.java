package com.hackerrank.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashmapSortByValues {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 3);
		map.put("B", 4);
		map.put("C", 2);
		map.put("D", 1);
		System.out.println(map);
		
		Map<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(k,v)->k,LinkedHashMap::new));
		
		System.out.println(collect);
		
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
//		.collect(Collectors.toMap(Map.Entry::getKey, null))
		
		map.entrySet().forEach(s->System.out.println(s.getValue()));

	}

}
