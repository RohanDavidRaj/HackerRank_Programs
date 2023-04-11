package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTheTriplets {

	public static void main(String[] args) {
		int a1 = 0;
		int b1 = 0;
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();

		a.add(5);
		a.add(6);
		a.add(7);
		
		b.add(3);
		b.add(6);
		b.add(10);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i)>b.get(i)) {
				a1++;
			}
			else if (a.get(i)<b.get(i)) {
				b1++;
			}
			else if (a.get(i)==b.get(i)) {
				
			}
		}

		System.out.println(a1 + " " + b1);

	}

}
