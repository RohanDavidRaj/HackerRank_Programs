package com.hackerrank.programs;

public class ValidUserNameRegex {
	
	public static void main(String[] args) {
		String s="Samantha";
		boolean matches = s.matches("^[a-zA-Z][\\w_]{7,29}$");
		System.out.println(matches);
	}

}
