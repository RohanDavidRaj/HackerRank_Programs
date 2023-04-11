package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Tower_of_Honai {

	public static void main(String[] args) {
		TreeSet Pole = new TreeSet<>();
		ArrayList Destination = new ArrayList<>();
		ArrayList Source = new ArrayList<>();
		Source.add(1);
		Source.add(2);
		Source.add(3);
		Source.add(4);
		Source.add(5);
		Source.add(6);
		Source.add(7);

		//List<Integer> Source1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//		Pole.add(1);
//		Pole.add(2);
//		Pole.add(3);
//		Pole.add(4);
//		Pole.remove(Pole.get((4-1)-1));
		System.err.println("source "+Source);
		
		for (int n=0;n<Source.size();n++) {
			if (Destination.isEmpty()) {
				Destination.add(n+1);
				Source.remove(0);
				System.out.println("Source "+Source);
				System.out.println("Pole "+Pole);
				System.err.println("Destination "+Destination);
				System.out.println("----------------------------------------------");
				
			} else if (Pole.isEmpty()) {
				Pole.add(n+1);
				Source.remove(0);
				System.out.println("Source "+Source);
				System.err.println("Pole "+Pole);
				System.out.println("Destination "+Destination);
				System.out.println("----------------------------------------------");

			}
			else  {
				//System.out.println(Source.get(0)+" > "+Destination+" prob");
				Pole.add(Destination.get(0));
				Destination.remove(0);
				Destination.add(n+1);
				Source.remove(0);

				System.out.println("Source "+Source);
				System.err.println("Pole "+Pole);
				System.err.println("Destination "+Destination);
				System.out.println("----------------------------------------------");

			}
		}
		Destination.addAll(0, Pole);
		System.err.println("FINAL DESTINATION "+Destination);

		
	}

}
