package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SubSet {

	public static void main(String[] args) {
		Integer[] a = { 1, 1, 1, 4, 3, 2 };
		int temp = 0;
		String st = "";
		List<Integer> list = new ArrayList<Integer>();
		TreeSet<String> out = new TreeSet<String>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
			temp = a[i];
			for (int j = 1; j < a.length; j++) {
				if (a[i] + a[j] == 5) {
					out.add(a[i] + " + " + a[j]);
				} else {
					temp = temp + a[j];
					list.add(a[j]);
					if (temp == 5) {
						for (Integer l : list) {
							st += l + " + ";
						}
						out.add((String) st.subSequence(0, st.length() - 2));
						st = "";
						list.clear();
						temp = 0;
					}
				}
			}
			st = "";
			temp = 0;
			list.clear();
		}
		for (String string : out) {
			System.err.println(string);
		}
	}

}
