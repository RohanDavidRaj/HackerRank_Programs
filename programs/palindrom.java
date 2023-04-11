package com.hackerrank.programs;

public class palindrom {

	public static void main(String[] args) {
		String A = "rohan";
		

		if (A.equalsIgnoreCase(new StringBuilder(A).reverse().toString())) {
   System.out.println("Yes");
		}
	}

}
