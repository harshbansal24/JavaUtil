package com.harsh.util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.designPattern.iterator.sample1.AllMyIterable;


public class AllCollection {

	public static void main(String[] args) {
		collectionIterate();
		iterableSample();
	}

	/**
	 * This method shows how to write your own Iterable class
	 */
	private static void iterableSample() {
		AllMyIterable<String> allMyIterable  = new  AllMyIterable<>(null);
	}

	public static void collectionIterate() {
		List<String> list = Arrays.asList(new String[] { "One", "Two", "Three", "Four", "Five" });
		{
			list.forEach(new Consumer<String>() {
				@Override
				public void accept(String t) {
					System.out.println(t);
				}
			});
		}
		{
			System.out.println("With final keyword");
			list.forEach((final String name) -> System.out.println(name));
		}
		{
			System.out.println("with function");
			list.forEach((name) -> System.out.println(name));
		}
		System.out.println("---ANOTHER WAY OF ITERATING---");
		for (String str : (Iterable<String>) list::iterator) {
			System.out.println("str " + str);
		}

		// Iterator<String> iterator = list.iterator();
		// if (iterator.hasNext()) {
		// iterator.remove();
		// }

	}
}
