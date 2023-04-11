package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CircularArray {
	
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(4);
	    ListIterator<Integer> it = numbers.listIterator();
	    int temp=0;
	    while(it.hasNext()) {
	    	if (!it.hasPrevious()) {
				temp=it.next();
				//System.err.println();
			}
	    	else {
				if (it.nextIndex()<5) {
					numbers.set(it.nextIndex(), temp);
					temp=it.next();
					
				}
			}
	    	System.err.println(temp);	
	    //	System.out.println(it.next());
	     
	    }
	    System.err.println(numbers);
	}

}
