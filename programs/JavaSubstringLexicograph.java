package com.hackerrank.programs;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class JavaSubstringLexicograph {

	public static void main(String[] args) {
		java.util.List<String> list = new java.util.ArrayList<String>();

		String s = "welcometojava";
		System.err.println(s.substring(s.length() - 3));
		for (int i = 0; i < s.length(); i++) {
			if (i <= s.length() - 3) {
				list.add(s.substring(i, i + 3));
			}
		}
		System.out.println(list);
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);

		String stringArray[] = { "Harit", "Girish", "Gritav", "Lovenish", "Nikhil", "Harman" };
		java.util.List<String> asList = java.util.Arrays.asList(stringArray);
		java.util.Arrays.sort(stringArray, String.CASE_INSENSITIVE_ORDER);
		
	
		
		
		

	}

}
