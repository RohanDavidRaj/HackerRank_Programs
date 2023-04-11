package com.hackerrank.programs;

import java.util.ArrayList;

public class MountainArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a[] = { 1,2,3,4,3,5};
		int pick = 1;

		for (int i = 0; i < a.length - 1; i++) {
			if (pick == 1) {
				if (a[i] < a[i + 1]) {
					list.add(1);
				} else if (a[i] == a[i + 1]) {
					list.add(0);
				} else if (a[i] > a[i + 1]) {
					list.add(0);
					pick = 0;
				}
			} else if (pick == 0) {
				if (a[i] > a[i + 1]) {
					list.add(1);
				} else {
					list.add(0);
				}
			}
		}
		System.err.println(list);
		if (list.stream().filter(d -> d == 0).count() == 1) {
			System.err.println("true");
		} else {
			System.err.println("false");
		}
		
		for (int i : list) {
			if (i==0) {
				System.out.println(a[list.indexOf(i)]);
			}
		}
	}

}
