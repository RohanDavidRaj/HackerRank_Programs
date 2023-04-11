package com.hackerrank.programs;

import java.util.ArrayList;

public class AngryProfressor {
	public static void main(String[] args) {
		int k = 3;
		int late = 0;
		int time = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(-1);
		arrayList.add(-3);
		arrayList.add(4);
		arrayList.add(2);

		for (Integer integer : arrayList) {
			if (integer > 0) {
				late++;
			} else if (integer <= 0) {
				time++;
			}
		}
		if (time >= k) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
