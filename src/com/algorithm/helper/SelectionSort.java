package com.algorithm.helper;

public class SelectionSort {

	public static void sortBySelection(int[] array) {
		System.out.println("Selection Sort Algorithm");
		for (int i = 0; i < array.length; i++) {
			int minimum = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minimum]) {
					minimum = j;
				}
			}
			if (array[i] != array[minimum]) {
				BubbleSort.swapValues(array, i, minimum);
			}
		}
	}
}