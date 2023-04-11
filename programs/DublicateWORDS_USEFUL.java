package com.hackerrank.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DublicateWORDS_USEFUL {
	public static void main(String[] args) {
		 // String regex ="\\b(\\w+)(?:\\W+\\1\\b)+";
		  String regex ="\\b(\\w+)(\\s+\\1)+\\b";
		 
		  
		  
		  String input = "Hello hello Ab aB";
		  Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

		  Matcher m = p.matcher(input);
		if (m.find()) {
			input = m.replaceAll("$1");
		}
		System.out.println(input);
		  
		  
	}

}
