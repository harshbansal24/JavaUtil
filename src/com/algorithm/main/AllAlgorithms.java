package com.algorithm.main;

import com.algorithm.helper.BinarySearch;
import com.algorithm.helper.BubbleSort;
import com.algorithm.helper.LinearSearch;
import com.algorithm.helper.SelectionSort;

public class AllAlgorithms {

	public static void main(String[] args) {
		int array[] = new int[10];
		setArray(array);
		LinearSearch.searchForValue(array, 15);
		BubbleSort.sortByBubble(array);
		printAllElements(array);
		BinarySearch.searchForValue(array,14);
		BinarySearch.searchForValueByRecursive(array,14);
		setArray(array);
		SelectionSort.sortBySelection(array);
		printAllElements(array);
		
	}

	private static void printAllElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	private static void setArray(int[] array) {
		array[0] = 10;
		array[1] = 17;
		array[2] = 13;
		array[3] = 15;
		array[4] = 18;
		array[5] = 11;
		array[6] = 15;
		array[7] = 9;
		array[8] = 14;
		array[9] = 12;
	}

}
