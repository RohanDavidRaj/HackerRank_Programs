package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ElectronicShop {

	public static void main(String[] args) {
		int[] keyword = { 3, 1};
		int[] drives = {5,2,8 };
		int b = 10;

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < keyword.length; i++) {
			for (int j = i; j < drives.length; j++) {
				arrayList.add(keyword[i] + drives[j]);
			}
		}

		if (arrayList.stream().filter(a -> a <=b).collect(Collectors.toList()).isEmpty()) {
			System.out.println("-1");
		} else {

			int max = arrayList.stream().filter(a -> a <= b).collect(Collectors.summarizingInt(Integer::intValue))
					.getMax();

			System.err.println(arrayList);
			System.err.println(max);
		}
	}

}
