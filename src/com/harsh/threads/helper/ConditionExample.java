package com.harsh.threads.helper;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionExample {

	public ConditionExample() {
		// TODO Auto-generated constructor stub
	}

	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	public void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		cond.await();
		System.out.println("---IN FIRST THREAD---");
		try {
			increment();
		} finally {
			lock.unlock();
		}
		System.out.println("---AFTER FIRST THREAD---");
	}

	public void secondThread() {
		lock.lock();

		
		System.out.println("---IN SECOND THREAD---");
		try {
			increment();
		} finally {
			cond.signal();
			lock.unlock();
		}
		System.out.println("---AFTER SECOND THREAD---");
	}

	public void total() {
		System.out.println("---TOTAL ---" + count);
	}
}
