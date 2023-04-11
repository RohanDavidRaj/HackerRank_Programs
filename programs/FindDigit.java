package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindDigit {
	
	public static void main(String[] args) {
		int in=123456789;
		int count=0;
	 String str = String.valueOf(in);
	
	String[] split = str.split("");
	List<String> asList=new ArrayList<String>();
	for (int i = 0; i < split.length; i++) {
		asList.add(split[i]);
	}
	for (int i = 0; i < asList.size(); i++) {
		//System.err.println(asList.get(i));
		if (Integer.parseInt(asList.get(i))!=0 && in % Integer.parseInt(asList.get(i))==0) {
			count++;
		}
	}
	
	System.out.println(count);
	 
	}

}
