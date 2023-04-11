package com.hackerrank.programs;

import java.util.ArrayList;

public class PlusMinus {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(-1);
		list.add(-1);
		list.add(0);
		
		double pos=0;
		double neg=0;
		double zero=0;
		
		for (Integer integer : list) {
			if (integer>0) {
				pos++;
			}
			else if (integer==0) {
				zero++;
			} 
			else {
				neg++;
			}
		}
		
		Double p=pos/list.size();
		Double n=neg/list.size();
		Double z=zero/list.size();
		System.out.printf("%,.6f ",p);System.out.println();
		System.out.printf("%,.6f ",n);System.out.println();
		System.out.printf("%,.6f ",z);
		//System.err.println(d+" "+neg/list.size()+" "+zero/list.size());
		
		
	}

}
