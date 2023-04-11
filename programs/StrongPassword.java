package com.hackerrank.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

	public static void name() {

	}

	public static void main(String[] args) {
		String password = "Ab1";

		int sp = 0;
		int num = 0;
		int up = 0;
		int low = 0;
		int z=0;
		
		int add=password.length();
	////////////	
		
			
			for (int i = 0; i < password.length(); i++) {
				if (Pattern.compile("(?=.*[A-Z])").matcher(password.substring(i, i + 1)).find()) {
					up++;
				} else if (Pattern.compile("(?=.*[a-z])").matcher(password.substring(i, i + 1)).find()) {
					low++;
				}
				else if (Pattern.compile("(?=.*\\d)").matcher(password.substring(i, i + 1)).find()) {
					num++;
				}
				else if (Pattern.compile("(?=.*[-+_!@#$%^&*., ?])").matcher(password.substring(i, i + 1)).find()) {
					sp++;
				}
			}
			/////////////////////////////
		

				
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("Special", sp);
		map.put("Upper", up);
		map.put("Lower", low);
		map.put("Number", num);
		System.err.println(map);
		
		long count = map.entrySet().stream().filter(a->a.getValue()==0).count();
		if (password.length()<=6) {
			if ((add+count)>=6) {
				System.err.println("j"+count);
			}	
			else {
				add=(int) (add+count);
				while (add<6) {
					z++;
					add++;
				}
				if (z>=6) {
					System.err.println(z);
				}
				else {
					System.err.println(z+count);
				}
			}
		}
		else {
			System.out.println((int)count);	
		}		
	
}

}
