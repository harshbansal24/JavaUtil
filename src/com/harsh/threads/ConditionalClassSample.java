package com.harsh.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionalClassSample {

	public static void main(String[] args) throws InterruptedException {
		final Lock lock = new ReentrantLock();
		final Condition cond = lock.newCondition();
		int count = 0;
		ExecutorService executor1 = Executors.newFixedThreadPool(1);
		ExecutorService executor2 = Executors.newFixedThreadPool(1);
		executor1.submit(new Odd(lock, cond));
		executor2.submit(new Even(lock, cond));
		executor1.shutdown();
		executor2.shutdown();
	}

}

class Odd implements Runnable {
	private Lock lock;
	private Condition cond;

	public Odd(Lock lock, Condition cond) {
		this.lock = lock;
		this.cond = cond;
	}

	@Override
	public void run() {
		this.lock.lock();
		System.out.println("Odd");
		try {
			cond.await();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("odd after signal");
		this.lock.unlock();
	}

}

class Even implements Runnable {
	private Lock lock;
	private Condition cond;

	public Even(Lock lock, Condition cond) {
		this.lock = lock;
		this.cond = cond;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			this.lock.lock();
			System.out.println("even");
			cond.signal();
			System.out.println("after await");
			this.lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}