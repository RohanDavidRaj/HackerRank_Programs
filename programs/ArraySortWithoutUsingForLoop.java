package com.hackerrank.programs;

import java.util.Arrays;

public class ArraySortWithoutUsingForLoop {
	
	public static void main(String[] args) {
		
		int[] a= {3,1,6,2};
		int[] b=new int[a.length];
		
		int i = 0;
		int x = 0;
		while (i<a.length) {
			System.out.println("ss "+a[i]);
			
			if (b[0]==0) {
				b[i]=a[i];
				i++;
			}
			else {
				if (a[i]<b[x]) {
					int temp=b[x];
					b[x]=a[i];
					b[x]=temp;
					i++;
					x++;
				}
				else {
					b[x+1]=a[i];
				}
			}
			i++;
			
		}
		System.err.println(Arrays.toString(b));
		
	}


}
