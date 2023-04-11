package com.hackerrank.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Aanagram {

	static boolean isAnagram(String a, String b) {
		int count = 0;
		Map<String, Long> ac = Arrays.asList(a.split("")).stream()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		Map<String, Long> bc = Arrays.asList(b.split("")).stream()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(bc.get("h"));
		if (a.equals(b)) {
			return true;
		} else {
			if (a.length() == b.length()) {

				for (int i = 0; i < a.length(); i++) {
					if (bc.containsKey(a.substring(i, i + 1))) {

						if (bc.get(b.substring(i, i + 1)) == ac.get(a.substring(i, i + 1))) {
							count++;
						}

					}

				}
				return a.length() == count;
			} else {
				return false;
			}
		}
		// Complete the function
	}

	public static void main(String[] args) {
		String a = "heelo";
		String b = "ehelo";
		System.out.println(isAnagram(a, b));

	}

}
