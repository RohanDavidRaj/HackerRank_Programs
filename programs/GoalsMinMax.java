package com.hackerrank.programs;

import java.util.*;


public class GoalsMinMax {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pair=0;
		int count=0;
				
		int len=sc.nextInt();
		
		//for taking input
 
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			
		  list.add(sc.nextInt());
		}
				
		int hs=list.get(0);
		int ls=list.get(0);
		int countHs=0;
		int countLs=0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)>hs) {
				hs=list.get(i);
				countHs++;
			}
			else if (list.get(i)<ls) {
				ls=list.get(i);
				countLs++;
				
				
			} 
		}
		list.clear();
		list.add(countHs);
		list.add(countLs);
			 
	}
}

