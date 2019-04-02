package com.algorithm.helper;

public class BinarySearch {

	public static void searchForValue(int[] array, int ivalue) {
		System.out.println("Binary Search Algorithm");
		int lowerIndex = 0;
		int higgerIndex = array.length - 1;
		while (lowerIndex < higgerIndex) {
			int middleIndex = (higgerIndex + lowerIndex) / 2;
			if (array[middleIndex] < ivalue) {
				lowerIndex = middleIndex + 1;
			} else if (array[middleIndex] > ivalue) {
				higgerIndex = middleIndex - 1;
			} else {
				System.out.println("Found the number at " + middleIndex);
				lowerIndex = higgerIndex;
			}
		}
	}

	public static void searchForValueByRecursive(int[] array, int i) {
		System.out.println("Binary Search by Recursion");
		System.out.println(searchByRecursive(array, i, 0, array.length - 1));

	}

	private static int searchByRecursive(int[] array, int search, int low, int high) {
		if (low > high) {
			return -1;
		}
		int middle = (low + high) / 2;
		if (array[middle] == search) {
			return middle;
		} else if (array[middle] < search) {
			return searchByRecursive(array, search, middle + 1, high);
		} else {
			return searchByRecursive(array, search, low, middle - 1);
		}
	}

}
