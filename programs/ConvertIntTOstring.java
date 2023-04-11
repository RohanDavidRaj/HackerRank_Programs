package com.hackerrank.programs;

import java.util.Scanner;

public class ConvertIntTOstring {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      int i=sc.nextInt();
	      String str=String.valueOf(i);
	      String st=str;
	      if(st.length()!=0){
	          System.out.println("Good Job");
	      }
	}

}
