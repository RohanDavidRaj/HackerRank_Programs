package com.hackerrank.programs;

import java.util.HashMap;

//22 75 70
//33 86 59
public class CatAndMouse {
	
	public static void main(String[] args) {
		int a=33; 
		int b=86;
		int m=59;
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(a, "A");
		hashMap.put(b, "B");
		
		
		if ((m-a)+(m-b)==0) {
			System.out.println("Mouse C");
			
		}
		else {
			int n= ( ( (m-a)>0?(m-a):-(m-a) )  <( ( (m-b>0?(m-b):-(m-b))) )  ?(a):(b) );
			System.out.println("Cat "+hashMap.get(n));
		}
		
	}

}
