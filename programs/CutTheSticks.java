package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CutTheSticks {

	public static List<Integer> minList(List<Integer> arr, List<Integer> re) {

		if (arr.isEmpty()) {
			return arr;
		}
		List<Integer> collect2 = arr.stream().min(Comparator.comparing(ad -> ad))
				.map(s -> arr.stream().map(xx -> xx - s)).get().collect(Collectors.toList());
		collect2.removeIf(z -> z == 0);

		if (!collect2.isEmpty()) {
			re.add(collect2.size());
		}
		minList(collect2, re);

		return collect2;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(4);
		arr.add(4);
		arr.add(2);
		arr.add(2);
		arr.add(8);

		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(arr.size());

		System.err.println("+= " + minList(arr, res));
		System.err.println(res);

	}

}
