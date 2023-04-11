package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClimbingTheLeaderBoard {

	public static void main(String[] args) {
		ArrayList<Integer> rank = new ArrayList<Integer>();
		rank.add(100);
		rank.add(90);
		rank.add(90);
		rank.add(80);
		rank.add(75);
		rank.add(60);
//		System.out.println(rank);

		ArrayList<Integer> players = new ArrayList<Integer>();
		players.add(50);
		players.add(65);
		players.add(77);
		players.add(90);
		players.add(102);

		// rank.stream().collect(Collectors.groupingBy(rank.,))

		ArrayList<Integer> ans = new ArrayList<Integer>();

//using streams--------		
//	   players.stream().map(d->{rank.add(d);
//		List<Integer> collect = rank.stream().sorted((a,b)->b-a).distinct().collect(Collectors.toList());
//		ans.add(collect.indexOf(d)+1);
//		rank.remove(d);
//		return d; }).collect(Collectors.toList());
//		
//		System.out.println(ans);

//using for-each

//		List<Integer> collect = rank.stream().distinct().collect(Collectors.toList());
//		int count = 0;
//		for (Integer p : players) {
//			for (Integer in : collect) {
//				if (in > p) {
//					count++;
//				}
//			}
//			ans.add(count + 1);
//			count = 0;
//		}
		
	players.stream().forEachOrdered(d->{
		int count = 0;
		List<Integer> collect = rank.stream().distinct().collect(Collectors.toList());
		for (Integer in : collect) {
			if (in > d) {
				count++;
			}
			}
 ans.add(count+1);});
	
		System.out.println(ans);

	}
	
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		
        List<Integer> rankedSet = ranked.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            
        List<Integer> playersRank = new ArrayList<>();
        
        for (int i=0;i<player.size();i++) {
            int rank = Collections.binarySearch(rankedSet, player.get(i), Collections.reverseOrder());
            playersRank.add(rank < 0 ? Math.abs(rank) : rank+1);
        }
        
        return playersRank;
    }

}
