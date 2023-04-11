package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowManySubstrings {
	
	
	public static void main(String[] args) {
		String s="aabaa";
		List<List<Integer>> queries =new ArrayList<List<Integer>>();
		List<Integer> left = Arrays.asList(1,1,1,1,0);
		List<Integer> right = Arrays.asList(1,4,1,4,2);
		
		queries.add(left);
		queries.add(right);
		
		System.err.println(s.substring(1, 4+1));
		String temp=(String) s.subSequence(0, 2);
		
		
	}

}
