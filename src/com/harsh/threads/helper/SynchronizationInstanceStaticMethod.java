package com.harsh.threads.helper;

public class SynchronizationInstanceStaticMethod implements Runnable {

	public SynchronizationInstanceStaticMethod() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void test1() {
		System.out.println("---inside test1---" + Thread.currentThread().getName());
		try {
			Thread.sleep((long) Math.random() * 10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---exiting 1---" + Thread.currentThread().getName());
	}

	public synchronized void test2() {
		System.out.println("---inside test2---" + Thread.currentThread().getName());
		try {
			Thread.sleep((long) Math.random() * 10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---exisint 2---" + Thread.currentThread().getName());
	}

	public synchronized static void test3() {
		System.out.println("---inside test3---" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---exisinting static---" + Thread.currentThread().getName());
	}

	public synchronized static void test4() {
		System.out.println("---inside test4---" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("---exisinting static4---" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		test1();
		test2();
		test3();
		test4();
	}
}
