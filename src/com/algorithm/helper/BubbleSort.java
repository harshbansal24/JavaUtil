package com.algorithm.helper;

public class BubbleSort {

	public static void sortByBubble(int[] array) {
		System.out.println("Bubble Sort Algorithm");
		for (int i = array.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swapValues(array, j, j + 1);
				}
			}
		}
	}

	public static void swapValues(int[] array, int j, int i) {
		array[j] = array[j] + array[i];
		array[i] = array[j] - array[i];
		array[j] = array[j] - array[i];
	}

}
