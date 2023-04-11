package com.hackerrank.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Testt {

	public static void main(String[] args) {
//		int numbeeps = 10;
//
//		for(int x=0;x<numbeeps;x++)
//		{
//			System.err.println("s");
//		  java.awt.Toolkit.getDefaultToolkit().beep();;
//		}

		int a[] = { 1, 2, 3, 5, 4, 4, 4 };
		Arrays.stream(a).boxed().filter(s -> s % 2 == 0).collect(Collectors.groupingBy(f -> f, Collectors.counting()))
				.entrySet().stream().forEach(dd -> {
					if (dd.getValue() == Arrays.stream(a).boxed().filter(s -> s % 2 == 0)
							.collect(Collectors.groupingBy(f -> f, Collectors.counting())).entrySet().stream()
							.map(s -> s.getValue()).collect(Collectors.summarizingInt(ff -> ff.intValue())).getMax()) {
						System.out.println();
					}
				});

		String in = "gbbaaccvs";
		List<Entry<String, Long>> collect2 = Arrays.stream(in.split(""))
				.collect(Collectors.groupingBy(re -> re, Collectors.counting())).entrySet().stream()
				.filter(mm -> mm.getValue() == 1).collect(Collectors.toList());

		System.out.println(collect2);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < collect2.size(); j++) {
				if (String.valueOf(in.charAt(i)).equalsIgnoreCase(collect2.get(j).getKey())) {
					System.err.println(in.charAt(i));
					break;
				}
			}
		}
//	

//	List<Entry<String, Long>> collect = Arrays.stream(in.split(""))
//			.collect(Collectors.groupingBy(dd->dd,Collectors.counting())).entrySet()
//	.stream().filter(pp->pp.getValue()==1,Collections.frequency(pp, in)).collect(Collectors.toList());
//	
	}

}
