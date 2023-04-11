package com.hackerrank.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortElementsByIndex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        System.out.println("Original list: " + list);
        
        List<Integer> sortedList = new ArrayList<Integer>(list);
        Collections.sort(sortedList);
        System.out.println("Sorted list: " + sortedList);
        
        List<Integer> resultList = new ArrayList<Integer>(list.size());
        for(int i=0; i<sortedList.size(); i++) {
            int index = list.indexOf(sortedList.get(i));
            resultList.add(index, sortedList.get(i));
            System.out.println("Result list: " + resultList);
        }
    }
}
