package com.harsh.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchSample {

	public static void main(String[] args) {
		CountDownLatch objCountDownLatch = new CountDownLatch(3);
		// We want following things to occur in same sequence.
		// 1. Pizza Making
		// 2. garlic Bread
		// 3. Cold Drink
		String[] items = new String[] { "Pizza", "Garlic", "Cold Drink" };
		// Thread t = new Thread(new CountDownLatchRunner(objCountDownLatch,
		// items));
		// t.start();
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.submit(new CountDownLatchRunner(objCountDownLatch, items));
		try {
			objCountDownLatch.await();
			System.out.println("Prepared everything");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		es.shutdown();
	}
}

class CountDownLatchRunner implements Runnable {

	private CountDownLatch cdl;
	private String[] items;

	CountDownLatchRunner(CountDownLatch cdl, String[] items) {
		this.cdl = cdl;
		this.items = items;
	}

	@Override
	public void run() {
		for (String string : items) {
			try {
				System.out.println("Preparing " + string);
				Thread.sleep(2000);
				System.out.println("Prepared " + string + " and reducing the count down latch " + cdl.getCount());
				cdl.countDown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}