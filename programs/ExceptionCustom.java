package com.hackerrank.programs;

import java.util.Scanner;

public class ExceptionCustom {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a/b);
		} catch (Exception e) {	
			System.out.println(e.getClass().getName());
		}
	}

}
