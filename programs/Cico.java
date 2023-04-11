package com.hackerrank.programs;

import java.util.Scanner;

public class Cico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String nextLine = sc.nextLine();
		String[] split = nextLine.split(" ");

		if (split.length == n) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
