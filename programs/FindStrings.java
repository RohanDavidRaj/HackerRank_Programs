package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindStrings {

	public static void main(String[] args) {
		ArrayList<String> w = new ArrayList<String>();
		w.add("wwylgbplrqsaurkdrznqudinktphqmqcihjvgenampyjrivcudlyceobsoaqzxbzqcjfkrrapgvvvzurcssmnflbnwuyfejlstqbrrytwcaqfouutoqefjrelnswaszlwjnajdolsxxxrerxocspfvhekawnuaaorowslfirqbyhljtexrkxpgdxltaoqgvwnobezjitdfllhkbldghrfrhmvknoycjostzpsxczrgvgccdnpzncmayqzmkhxraafyidkmqlwvuczybufvduhtkibzwmfithwlaxjlprsjuctpwobyebwjbsvjlhpwpjsalblnzhsigproikectugqldhfjzsfzdbbhfuxxzmpopeanwvgqmkxljbxckasbmdmbqkvurlplbbayudbppbkjkdgumvivyxikdvebmvfqxbgyywjxjuysrlvruyxnmcxxlnbwovrfrcktqzpnnqcpnipyihcqjclkwjjzcbe");
		// w.add("aac");

		List<Integer> queries = new ArrayList<Integer>();
		queries.add(3);
		queries.add(8);
		queries.add(23);

		String str = "";
		TreeSet<String> out = new TreeSet<>();

		for (String string : w) {
			out.add(string);
			for (int i = 0; i < string.length(); i++) {
				out.add(string.charAt(i) + "");
				str = string.charAt(i) + "";
				for (int j = i + 1; j < string.length(); j++) {
					str += string.charAt(j) + "";
					out.add(str);
				}
				str = "";
			}
		}
		List<String> collect = new ArrayList<String>();
		System.err.println(out);
		Object[] array = out.toArray();
		for (Integer integer : queries) {
			if (integer <= out.size()) {
				collect.add(out.toArray()[integer - 1].toString());
			} else {
				collect.add("INVALID");

			}
		}
		System.err.println(collect);
	}

}
