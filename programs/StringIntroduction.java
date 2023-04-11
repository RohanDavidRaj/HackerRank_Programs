package com.hackerrank.programs;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringIntroduction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String total = A + B;
		System.out.println(total.length());

		List<String> list = new ArrayList<String>();
		list.add(A);
		list.add(B);
		int get_val = A.compareTo(B);

		if (get_val < 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

		List<String> collect = list.stream().map(a -> a.substring(0, 1).toUpperCase() + a.subSequence(1, a.length()))
				.collect(Collectors.toList());
		System.out.println(collect.get(0) + " " + collect.get(1));

	}
}
