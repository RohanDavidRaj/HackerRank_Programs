package com.hackerrank.programs;

public class CountingValley {
	
	public static void main(String[] args) {
		int steps=8;
		String path="UDDDUDUU";
		
		String[] split = path.split("");
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals("U")) {
				System.out.print(split[i]);
			}
			else if (split[i].equals("D")) {
				System.out.println(split[i]);
			}
		}
		
			
	}

}
