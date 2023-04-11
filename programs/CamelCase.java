package com.hackerrank.programs;

import java.util.Arrays;
import java.util.Iterator;

public class CamelCase {
	
	public static void main(String[] args) {
		String str="myNameIsRohan";
		String st="";
				
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)<90) {
				st=st.concat(" "+str.charAt(i));
			}	
			else {
				st=st.concat(str.charAt(i)+"");
			}
			
		
		}
		System.err.println(st);
		
		
		
		
	}

}
