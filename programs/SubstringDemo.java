package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringDemo {
	public static void main(String[] args) {
		String st = "aabaa";
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> fir = Arrays.asList(1, 1, 1, 1, 0);
		List<Integer> sec = Arrays.asList(1, 4, 1, 4, 2);
		List<Integer> result = new ArrayList<Integer>();
		
		System.out.println(st.substring(0, 4));
		lists.add(fir);
		lists.add(sec);
		System.err.println(lists);
		for (int i = 0; i < fir.size(); i++) {
			int find=fir.get(i);
			int secInd=sec.get(i);
			if(find==1) {
				find=find-1;
			}
			if(fir.get(i)==0) {
				secInd=secInd+1;
			}
			String res = st.substring(find, secInd);
			result.add(getCount(res));
		}
		
		System.out.println(result);
	}

	private static Integer getCount(String res) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < res.length(); i++) {
			String st = res.charAt(i) + "";
			set.add(st);
			for (int j = i + 1; j < res.length(); j++) {
				st =st+ res.charAt(j) + "";
				set.add(st);
			}
			
		}
		System.out.println("-----------------------------");
		return set.size();
	}
}
