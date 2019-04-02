package com.harsh.threads.helper;

public class StaticNonStaticMethodCall {
	public static synchronized void test1() {
		try {
			System.out.println("Inside static ");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Out of static");
	}

	public synchronized void test2() {
		try {
			System.out.println("Inside Test2");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Out of Test2");
	}

	public synchronized void test3() {
		try {
			System.out.println("Inside Test3 ");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Out of Test3");
	}

	public static synchronized void test4() {
		try {
			System.out.println("Inside static 2");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Out of static 2");
	}
}
