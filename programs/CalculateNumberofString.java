package com.hackerrank.programs;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CalculateNumberofString {
	
	public static void main(String[] args) {
		String a="hi i am rohan 2.3 5a";
		
		String[] split = a.split(" ");
		int st=0; 
		int in=0;
		int dou=0;
		for (String string : split) {
			if ((Pattern.compile("[0-9]*").matcher(string).matches()) ) {
				in++;
			}
			else if ((Pattern.compile("[0-9]{1,13}(\\.[0-9]*)?").matcher(string).matches())) {
				dou++;
			}
			
			
		}
	   in=0;
	   
		String str = a.replaceAll("[^a-zA-Z]", " "); 
		String[] split2 = str.split(" ");
		for (String string : split2) {	
			if ((Pattern.compile("[a-zA-Z]*").matcher(string).matches()) && !string.isEmpty() ) {
				st++;
			}
		}
		
		String str1 = a.replaceAll("[^\\d.]", ""); 
		String[] split3 = str1.split("");
		System.out.println(str1);
		System.out.println(Arrays.toString(split3));
		for (String string : split3) {	
			if ((Pattern.compile("[0-9]").matcher(string).matches()) && !string.isEmpty() ) {
			in++;
			}
		}
		
		System.err.println("string "+st);
		System.err.println("num "+in);
		System.err.println(dou);
		
		
		
	
	}
	

}
