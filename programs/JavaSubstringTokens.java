package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaSubstringTokens {
	public static void main(String[] args) {
		//String s="He is a very very 'good' boy, isn't he?";
		String s="           YES      leading spaces        are valid,    problemsetters are         evillllll";
		List<String> list=new ArrayList<String>();
		String trim = s.trim();

		String str = trim.replaceAll("[!,?._'@]+", " ");
		String replaceA = str.replaceAll("  ", " ");
		String replaceAll = replaceA.replaceAll("//s", "");
				
		String[] split1 = replaceAll.split(" ");
		for (int i = 0; i < split1.length; i++) {
			if (!split1[i].equals(" ")&&!split1[i].equals("")) {
				list.add(split1[i]);
			}
			
		}
		System.out.println(list.size());
		list.forEach(System.out::println);
		
		
		
//		String[] split = str.split(" ");
//		
//	//	str.replaceAll("\\^([0-9]+)", "<sup>$1</sup>");
//		
//		
//		System.err.println(str);
//		List<String> asList = Arrays.asList(split);
//		
//		List<String> collect =Arrays.stream(split).filter(a->!a.equals(" ")).collect(Collectors.toList());
//		System.out.println("rr "+collect);
//		List<String> collect2 = collect.stream().filter(a->!a.equalsIgnoreCase(" ")).collect(Collectors.toList());
//		
//		for (String string : collect2) {
//			string.replaceAll(" ","");
//		}
		
			

	}

}
