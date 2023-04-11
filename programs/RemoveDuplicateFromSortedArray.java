package com.hackerrank.programs;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicateFromSortedArray {
	
	
	
	public static void main(String[] args) {
		int [] nums= {0,0,1,1,1,2,2,3,3,4};
		
	    
		for (int i = 0; i < nums.length; i++) {
			for (int j=i+1; j< nums.length; j++) {
				if (nums[i]==nums[j]) {
					nums[j]=999999;
				}
				
			}			
		}
		Arrays.sort(nums);
		int count=0;
		for (int i : nums) {
			if (i!=999999) {
				count++;
			}
		}
		System.err.println(Arrays.toString(nums));
		System.err.println(count);
	}

}
