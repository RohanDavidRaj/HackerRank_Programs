package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class MorganAndString {

	public static String morganAndString(String a, String b) {
		String out = "";

		ArrayList<String> a1 = new ArrayList<>(Arrays.asList(a.split("")));
		ArrayList<String> b1 = new ArrayList<>(Arrays.asList(b.split("")));

		
		int i = 0;
		while (a1.size() > 0 && b1.size() > 0) {
			if (a1.get(i).charAt(0) < b1.get(i).charAt(0)) {
				out = out + a1.get(0);
				a1.remove(0);
				i = 0;
			} else if (a1.get(i).charAt(0) > b1.get(i).charAt(0)) {
				out = out + b1.get(0);
				b1.remove(0);
				i = 0;
			} else if (a1.get(i).charAt(0) == b1.get(i).charAt(0)) {
				if (i < a1.size()-1) {
					i = i + 1;
				}
				else {
					out = out + a1.get(0);
					a1.remove(0);
					i = 0;
				}
			}

		}

		if (a1.isEmpty() && b1.isEmpty()) {
			System.err.println(out);
		}
		
		else if (a1.isEmpty()) {
			for (String string : b1) {
				out = out + string;
			}
			System.err.println(out);
		} else if (b1.isEmpty()) {
			for (String string : a1) {
				out = out + string;
			}
			return out;
		}
		return out;

	}

	
	
	
	
	public static void main(String[] args) {
		String a = "ABACABA";
		String b = "ABACABA";

		System.out.println(morganAndString(a, b));
	}

}
