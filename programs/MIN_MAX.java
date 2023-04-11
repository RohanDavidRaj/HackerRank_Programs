package com.hackerrank.programs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class MIN_MAX {

	public static void main(String[] args) {
		List<Long> in = new ArrayList<Long>();
		List<Long> out = new ArrayList<Long>();
		int temp = 0;
//		in.add(1l);
//		in.add(3l);
//		in.add(5l);
//		in.add(7l);
//		in.add(9l);

		//in.add(256741038);
		
		in.add(256741038l);
		in.add(623958417l);
		in.add(467905213l);
		in.add(714532089l);
		in.add(938071625l);
		
		long sum = 0 ;
		for(int i = 0; i < in.size(); i++){
		    sum = sum+in.get(i);
		}
		System.out.println(sum);
		//System.err.println(in.stream().mapToLong(a->a).sum());
		
		for (Long integer : in) {
			//	System.out.println(integer);
				out.add(in.stream().mapToLong(a->a).sum()-integer);
				//System.err.println("total "+in.stream().reduce(0, Integer::sum).intValue());
			}
		System.out.println(out);
		LongSummaryStatistics collect = out.stream().collect(Collectors.summarizingLong(a->a));
          System.out.println(collect.getMin()+" "+collect.getMax());
//		for (Integer integer : in) {
//		//	System.out.println(integer);
//			out.add(in.stream().reduce(0, Integer::sum).intValue() - integer);
//			System.err.println("total "+in.stream().reduce(0, Integer::sum).intValue());
//		}
//		for (int i = 0; i < out.size(); i++) {
////			if (out.get(i)<0) {
////				//System.out.println("@@@@@@@@");
////				out.remove(i);
////			}
//			System.err.println(out.get(i));
//	
//		}
//		IntSummaryStatistics collect = out.stream().collect(Collectors.summarizingInt(a -> a));
//		System.out.println(collect.getMin() + " " + collect.getMax());
//	}
	}
	}
