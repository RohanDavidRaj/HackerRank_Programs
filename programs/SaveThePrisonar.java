package com.hackerrank.programs;

import java.util.stream.IntStream;

public class SaveThePrisonar {

	public static void main(String[] args) {
		int n = 5;
		int m = 2;
		int s = 2;
		int count = 0;
		int last = 0;

		for (int i = 1; i <= m; i++) {
			for (int j = s; j <= n; j++) {
				if (count < m) {
					count++;
					last = j;
				}
			}
			s = 1;
		}
		System.out.println(last);
	}

}
