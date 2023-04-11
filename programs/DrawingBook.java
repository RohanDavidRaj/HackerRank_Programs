package com.hackerrank.programs;

import java.util.HashMap;
import java.util.Iterator;

public class DrawingBook {

	public static void main(String[] args) {
		int n = 6;
		int p = 4;
		int temp = 1;

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(0, "1");
		int i = 1;

		while (i <= n && temp <= n - 1) {
			hashMap.put(i, (temp + 1) + "," + ((temp >= n - 1) ? ("") : (temp + 2)));
			temp = temp + 2;
			// System.err.println(temp);
			i++;
		}
		System.out.println(hashMap);

		int intValue = hashMap.entrySet().stream().filter(a -> a.getValue().contains(String.valueOf(p)))
				.map(s -> s.getKey()).findAny().get().intValue();

		long count = hashMap.entrySet().stream().skip(intValue).peek(System.out::print).count();

		int a = (int) (intValue > count - 1 ? count - 1 : intValue);

		System.err.println(a);
	}

}
