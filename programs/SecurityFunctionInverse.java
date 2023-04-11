package com.hackerrank.programs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecurityFunctionInverse {

	public static void main(String[] args) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		String nextLine = sc.nextLine();
		String[] split = nextLine.split(" ");
		for (int i = 0; i < n; i++) {
         m.put(i+1, Integer.parseInt(split[i]));
		}
		System.err.println(m);
		LinkedHashMap<Integer, Integer> collect = m.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, 
				                  Map.Entry::getValue,(oldValue,newValue)->oldValue, LinkedHashMap::new));
      collect.entrySet().forEach(az->System.out.println(az.getKey()));
	}

}
