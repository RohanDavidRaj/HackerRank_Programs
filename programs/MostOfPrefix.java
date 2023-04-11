package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostOfPrefix {

	public static String str(String[] strArr) {
		List<String> str1 = Arrays.asList(strArr);
		List<String> str = str1.stream().filter(a -> a.length() > 2).collect(Collectors.toList());

		if (str.isEmpty()) {
			if (str1.stream().filter(a -> !a.equalsIgnoreCase("") && !(a.equalsIgnoreCase(" ")))
					.collect(Collectors.toList()).isEmpty()) {
				return strArr[0];
			} 
			///for 222222222222222222
			else {
				List<String> tw = str1.stream().filter(a -> !a.equalsIgnoreCase("") && !(a.equalsIgnoreCase(" ")))
				.collect(Collectors.toList());
				Map<String, Integer> map = new HashMap<String, Integer>();

				for (int i = 0; i < tw.size(); i++) {
					int z = 1;
					for (int j = i + 1; j < tw.size(); j++) {
						if (tw.get(j).substring(0, 1).contains(tw.get(i).substring(0, 1))) {
							z++;
						}
					}

					if (map.containsKey(tw.get(i).substring(0, 1))) {

					} else {
						if (map.get(i) == null) {
							map.put(tw.get(i).substring(0, 1), z);
						}
					}
					z = 0;
				}
				Entry<String, Integer> entry = map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get();
				//System.out.println(entry);
				// System.err.println(map);
				if (map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get().getValue() > 1) {
					return map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get().getKey();
				} else {
					if (strArr.length==1) {
						return strArr[0];
					}
					return "";
				}

				
				
			}

			// --------------------------------for 1
		} else if (str.size() == 1) {
			;
			return str.get(0).substring(0,2);

		} else {

			Map<String, Integer> map = new HashMap<String, Integer>();

			for (int i = 0; i < str.size(); i++) {
				int z = 1;
				for (int j = i + 1; j < str.size(); j++) {
					if (str.get(j).substring(0, 2).contains(str.get(i).substring(0, 2))) {
						z++;
					}
				}

				if (map.containsKey(str.get(i).substring(0, 2))) {

				} else {
					if (map.get(i) == null) {
						map.put(str.get(i).substring(0, 2), z);
					}
				}
				z = 0;
			}
			Entry<String, Integer> entry = map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get();
			//System.out.println(entry);
			// System.err.println(map);
			if (map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get().getValue() > 1) {
				return map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get().getKey();
			} else {
				
				return "";
			}

		}
	}

	public static void main(String[] args) {

		String[] stringarray = {"cir","car"};
		List<String> asList = Arrays.asList(stringarray);
//		System.err.println(asList);
		List<String> grer = asList.stream().filter(a->a.length()>2).collect(Collectors.toList());
		List<String> collect = asList.stream().filter(a -> !a.equalsIgnoreCase("") && !(a.equalsIgnoreCase(" ")))
				.collect(Collectors.toList());

		boolean empty = asList.stream().filter(a -> !a.equalsIgnoreCase("") && !(a.equalsIgnoreCase(" ")))
				.collect(Collectors.toList()).isEmpty();

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("aa", 1);
		map.put("aaa", 4);

		// Entry<String, Integer> entry = map.entrySet().stream().max((a, b) ->
		// a.getValue() - b.getValue()).get();
//	 Integer key = collect.stream().collect(Collectors.groupingBy(String::length))
//		.entrySet().stream().filter(a->a.getKey()>1).collect(Collectors.toList()).get(0).getKey();
//	 collect.stream().collect(Collectors.groupingBy(String::length))
//		.entrySet().stream().filter(a->a.getKey()>1).collect(Collectors.toList()).get(0).getKey();

//		System.err.println(stringarray[0].equalsIgnoreCase(""));
//		System.out.println(collect);
//		System.out.println(empty);

	//	System.err.println(grer);
	
		
			 System.err.println(str(stringarray));

	}
}
