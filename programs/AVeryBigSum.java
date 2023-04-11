package com.hackerrank.programs;

import java.util.ArrayList;

public class AVeryBigSum {
	
	public static void main(String[] args) {
		ArrayList<Long> list=new ArrayList<Long>();
		list.add(1000000001l);
		list.add(1000000001l);
		list.add(1000000001l);
		list.add(1000000001l);
		list.add(1000000001l);
		//1000000001 1000000002 1000000003 1000000004 1000000005
		
		long sum = list.stream().mapToLong(a->a).sum();
		System.out.println(sum);

	}

}
