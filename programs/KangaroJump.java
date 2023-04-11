package com.hackerrank.programs;

import java.util.Scanner;

public class KangaroJump {
	
	public static String kangaroo(int sp1, int v1, int sp2, int v2) {
        String msg="";
        for(int i=0;i<=100;i++){
            sp1=sp1+v1;
            sp2=sp2+v2;
            if(sp1==sp2){
                 msg="Yes";
                break;
            }
            else{
                msg="No";
            }
            
        }
        return msg;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(kangaroo(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}

}
