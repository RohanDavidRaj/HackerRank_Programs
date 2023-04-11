package com.hackerrank.programs;

import java.util.ArrayList;

public class BundelShivani {

	public static void main(String[] args) {
		int a[] = { 42, 15, 12, 8, 6, 20, 4, 32 };
		int sum = 26;
		
		ArrayList<String> out = new ArrayList<>();

		int temp = 0;
		String te = "";
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			for (int j = i+1; j < a.length; j++) {
				temp = temp + a[j];
				if (temp == 26) {
					for (int h = i; h < j; h++) {
						te = te + "+" + a[h];
					}
					String substring = te.substring(1);
					te=substring;
					out.add(te + "+" + a[j]);

				}
			}
			temp = 0;
			te="";
		}
		System.out.println(out+" = "+sum);

	}

}
