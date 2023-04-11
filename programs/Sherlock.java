package com.hackerrank.programs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sherlock {

	public static void main(String[] args) {
		String in="aaaabbcc";
			
				 Map<Long, String> charCountMap = in.chars()
				     .mapToObj(c -> (char) c)
				     .collect(Collectors.groupingBy(
				         Function.identity(),
				         Collectors.counting()
				     ))
				     .entrySet().stream()
				     .collect(Collectors.groupingBy(
				         Map.Entry::getValue,
				         Collectors.mapping(
				             Map.Entry::getKey,
				             Collectors.mapping(
				                 String::valueOf,
				                 Collectors.joining()
				             )
				         )
				     ));
				 
				 List<Entry<Long, String>> collect = charCountMap.entrySet()
						  .stream().collect(Collectors.toList());
				
			
				 if (collect.size()>2) {
				System.out.println("NO");	
				}
				 else if (collect.get(0).getValue().length()==1 && collect.get(1).getValue().length()>1) {
					System.out.println("YES");
				}
				 else if (collect.get(1).getValue().length()==1 && collect.get(0).getValue().length()>1) {
						System.out.println("YES");
					}
				 else if (collect.get(1).getValue().length()==collect.get(0).getValue().length()
						 || !(collect.get(1).getValue().length()==collect.get(0).getValue().length()
						 )) {
						System.out.println("NO");
					}
				
				System.err.println(charCountMap);
				
			
			
				
		
		 
	
		 
		
	}
}
