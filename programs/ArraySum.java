package com.hackerrank.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static List<List<Integer>> findCombinations(int[] arr, int target) {
		Arrays.sort(arr); // sort the array for efficient searching
		List<List<Integer>> result = new ArrayList<>();
		findCombinationsHelper(arr, target, 0, new ArrayList<Integer>(), result);
		return result;
	}

	private static void findCombinationsHelper(int[] arr, int target, int start, List<Integer> curr,
			List<List<Integer>> result) {
		if (target == 0) { // if the target is reached, add current combination to the result
			result.add(new ArrayList<>(curr));
			return;
		}
		for (int i = start; i < arr.length && arr[i] <= target; i++) {
			if (i > start && arr[i] == arr[i - 1])
				continue; // skip duplicate elements to avoid duplicates in result
			curr.add(arr[i]); // add current element to the combination
			findCombinationsHelper(arr, target - arr[i], i + 1, curr, result); // recursively search for remaining sum
			curr.remove(curr.size() - 1); // backtrack and remove current element from combination
		}
	}

	public static void main(String[] args) {
		int[] arr = { 42, 12, 23, 1, 13, 2, 14 };
		int target = 26;
		List<List<Integer>> result = findCombinations(arr, target);
		for (List<Integer> list : result) {
			System.out.println(list);
		}
	}
}
