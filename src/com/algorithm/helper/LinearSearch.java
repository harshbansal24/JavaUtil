package com.algorithm.helper;

public class LinearSearch {

	public static void searchForValue(int[] array, int i) {
		System.out.println("Liner Search Algorithm");
		String index = "";
		for (int arrayElement = 0; arrayElement < array.length; arrayElement++) {
			if (array[arrayElement] == i) {
				index += arrayElement + " ";
			}
		}

		if (!"".equals(index)) {
			System.out.println("index is " + index);
		} else {
			System.out.println("Element not present");
		}
	}

}
