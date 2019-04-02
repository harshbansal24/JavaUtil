package com.harsh.pritam;

import java.io.IOException;

public class TestCollection implements Runnable {

	int k;

	public TestCollection() {
	}

	public static void main(String[] args) {
		
		
		
		
		int[] values = new int[5];

		values[0] = 5;
		values[1] = 10;
		values[2] = 15;
		values[3] = 200;
		values[4] = 61;

		twoLargest(values);
		System.out.println();
		A a = new B();
		try {
			a.foo();
		} catch (IOException ex) {
			// forced to catch this by the compiler
		}
	}

	public static void twoLargest(int values[]) {
		int largestA = 0;
		int largestB = 0;
		for (int i = 0; i < values.length; i++) {
			if (largestA < values[i]) {
				largestB = largestA;
				largestA = values[i];
			} else if (largestB < values[i]) {
				largestB = values[i];
			}
		}
		System.out.println("" + largestA + "  " + largestB);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}

class A {
	public void foo() throws IOException {
	}
}

class B extends A {
	@Override
	public void foo() throws ArrayIndexOutOfBoundsException {
	} // allowed
	// @Override
	// public void foo() {}
	// public void foo() throws SQLException {} // NOT allowed

}
