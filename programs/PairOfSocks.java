package com.hackerrank.programs;

import java.util.*;

public class PairOfSocks {
	
//	public int scoks(int n,List<Integer> arr) {
//		
//		
//		
//		
//		return n;
//		
//	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int pair=0;
		int count=0;
		
		
		int len=sc.nextInt();
//		int[] arr= new int[len];
//		int[] arr1= {10,20,20,10,10,30,50,10,20};
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr1.length; j++) {
//				if (arr1[i]==arr1[j]) {
//					count++;
//				}
//			}
//	}
		
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			
		  list.add(sc.nextInt());
		}
		Collections.sort(list);
		
       
        
        
//			for (int i = 0; i <list.size();i++) {
//				
//				if (i<list.size()-1) {
//					if (list.get(i)==list.get(i+1)) {
//						pair+=1;
//						i=i+2;
//					}
//					count++;
//					
//				}		
//		}
			int z=0;
			while (z <list.size()-1) {
				if (list.get(z)==list.get(z+1)) {
					pair+=1;
					z=z+2;
				}
				else
				{
					z++;
				}
			}
     
    	   System.out.println(pair);
    
	
			
		}
		
		
	}


