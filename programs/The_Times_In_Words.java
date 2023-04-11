package com.hackerrank.programs;

import java.util.HashMap;
import java.util.Map;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class The_Times_In_Words {
	
	public static String numToWords(int n) {
		Map<Integer, String> unit=new HashMap<Integer, String>();
		unit.put(1, "one");unit.put(2, "two");unit.put(3, "three");unit.put(4, "four");unit.put(5, "five");
		unit.put(6, "six");unit.put(7, "seven");unit.put(8, "eight");unit.put(9, "nine");
		 
		Map<Integer, String> tens=new HashMap<Integer, String>();
		tens.put(10, "ten");tens.put(20, "twenty");tens.put(30, "thirty");tens.put(40, "fourty");tens.put(50, "fivty");
		tens.put(60, "sixty");tens.put(70, "seventy");tens.put(80, "eighty");tens.put(90, "ninety");
		
		Map<Integer, String> teen=new HashMap<Integer, String>();
		teen.put(11, "eleven");teen.put(12, "twelve");teen.put(13, "thirteen");teen.put(14, "fourteen");teen.put(15, "fivteen");
		teen.put(16, "sixteen");teen.put(17, "seventeen");teen.put(18, "eighteen");teen.put(19, "nineteen");
		
		
		if (n==0) {
			return "";
		}
		else if (n<=9) {
			return unit.get(n);
		}
		else if (n>9 && n<20) {
			return teen.get(n);
		}
		else if (n>=20) {
			//converting example 28 in to string
			//and taking 2 from it by using sub-string and adding zero to it 
			//to check in teen map and to check another digit 8 in unit
			String str = String.valueOf(n);
			
			return tens.get(Integer.parseInt(str.substring(0, 1)+"0"))+" "+unit.get(Integer.parseInt(str.substring(1, 2)));
		}
		return null;
	}
	
	public static String main(int hr ,int min) {
			
		if (min==0) {
			return (numToWords(hr)+" o' clock");
		}
		else if(min==15){
			return("quarter past "+numToWords(hr));
		}
		else if(min==30){
			return("half past "+numToWords(hr));
		}
		else if(min==45){
			return("quarter to "+numToWords(hr+1));
		}
		else if(min>=1 && min<30){
			if (min==1) {
				return(numToWords(min)+" minute past "+numToWords(hr));
			}
			return(numToWords(min)+" minute past "+numToWords(hr));
		}
		else if(min>30){
			return(numToWords(60-min)+" minutes to "+numToWords(hr));
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(main(1, 1));
	}

}
