package com.hackerrank.programs;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class DiverForStudentt {
	
	public static void main(String[] args) throws ClassNotFoundException {

		Class studentt = Class.forName(Studentt.class.getName());
		Method[] declaredMethods = studentt.getDeclaredMethods();
		 ArrayList<String> methodList = new ArrayList<>();
         
		 for(int i=0;i<declaredMethods.length;i++){
            methodList.add(declaredMethods[i].getName());
         }
         
         Collections.sort(methodList);
         for(Object name: methodList){
             System.out.println(name);
         }
	}

}
