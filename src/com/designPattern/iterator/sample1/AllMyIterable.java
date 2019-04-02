package com.designPattern.iterator.sample1;

import java.util.Iterator;

public class AllMyIterable<T> implements Iterable<T> {

	public T[] a = null;

	public AllMyIterable(T[] a) {
		this.a = a;
	}

	public static void main(String[] args) {
		String[] technologies = { "Java", "JEE", "XML" };
		AllMyIterable<String> allMyIterable = new AllMyIterable<>(technologies);
		for (String string : allMyIterable) {
			System.out.println(string);
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int count = 0;

			@Override
			public boolean hasNext() {
				return count < a.length;
			}

			@Override
			public T next() {
				System.out.println("---New object is---");
				return a[count++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("remove is not allowed");
			}
		};
	}

}
