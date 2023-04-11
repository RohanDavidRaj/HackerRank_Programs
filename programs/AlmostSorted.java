package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlmostSorted {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		String st="1 4 2 5";
		
String[] split = st.split(" ");
		for (String string : split) {
			list.add(Integer.parseInt(string));
		}
		

//		list.add(1);list.add(5);list.add(4);list.add(3);list.add(2);
//		list.add(6);

//		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
//		list.add(6);

		for (int i = 0; i < list.size() - 1; i++) {
			map.put(i + 1, list.get(i) - list.get(i + 1));
		}
		//System.err.println(map);
		long count = map.entrySet().stream().filter(a -> a.getValue() < 0).count();
		if (count == list.size() - 1) {
			System.out.println("yes");
		}
		long count2 = map.entrySet().stream().filter(a -> a.getValue() > 0).count();
System.err.println(count);
		if (count2 < 2) {

			if (count2 > 1) {
				int z = map.entrySet().stream().filter(a -> a.getValue() > 0).skip(count2 - 1).findFirst().get()
						.getKey().intValue() + 1;

				System.out.println("yes");
				System.out.println("swap "
						+ map.entrySet().stream().filter(a -> a.getValue() > 0).findFirst().get().getKey() + " " + z);
			} else {
				System.out.println("no");
			}
		}
		if (count2 > 2) {

			int z = map.entrySet().stream().filter(a -> a.getValue() > 0).skip(count2 - 1).findFirst().get().getKey()
					.intValue() + 1;

			System.out.println("yes");
			System.out.println("reverse "
					+ map.entrySet().stream().filter(a -> a.getValue() > 0).findFirst().get().getKey() + " " + z);
		}

	}
}
