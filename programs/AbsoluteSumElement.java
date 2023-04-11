package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AbsoluteSumElement {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> queries = new ArrayList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		arr.add(-1);
		arr.add(2);
		arr.add(-3);
		queries.add(1);
		queries.add(-2);
		queries.add(3);

		queries.stream().forEach(o -> {
			for (int i = 0; i < arr.size(); i++) {
				arr.set(i, o + arr.get(i));
			}
			res.add(arr.stream().mapToInt(ad -> ad).map(as -> as > 0 ? as : Math.abs(as)).sum());
		});

		System.err.println(res);

	}

}
