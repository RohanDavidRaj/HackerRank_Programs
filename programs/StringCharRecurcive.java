package com.hackerrank.programs;

import java.util.HashMap;
import java.util.Iterator;

public class StringCharRecurcive {

	public static void main(String[] args) {
		String str = "madam";
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int count = 0;

		for (Character ch : str.toCharArray()) {
			if (hashMap.containsKey(ch)) {
				System.out.println(ch);
				break;
			}
			hashMap.put(ch, 0);
		}
	}

}
