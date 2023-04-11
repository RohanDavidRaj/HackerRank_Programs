package com.hackerrank.programs;

import java.util.Arrays;

public class ArrayRecurive {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int k = 2;

		System.err.println(a.length - (k));
		for (int i = 0; i < k; i++) {
			int temp = a[i];
			a[i] = a[a.length - k - 1];
			a[a.length - k - 1] = temp;
		}
		System.err.println(Arrays.toString(a));

	}

}
