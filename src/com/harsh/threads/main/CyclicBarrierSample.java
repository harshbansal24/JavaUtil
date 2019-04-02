package com.harsh.threads.main;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSample {
	public static void main(String[] args) {

		// cyclicBarrierSimpleExample();
		cyclicBarrierWith2ArgConstructor();
	}

	/**
	 * This method is same as cyclicBarrierSimpleExample but after three threads
	 * reached the barrier anothe class implementing runnable will be called.
	 */
	private static void cyclicBarrierWith2ArgConstructor() {
		CyclicBarrier cb = new CyclicBarrier(3, new CyclicBarrierFinishEvent());
		try {
			Thread t1 = new Thread(new CyclicBarrierRunner(cb, 1));
			t1.setName("Passenger 1");
			t1.start();
			Thread.sleep(1000);
			Thread t2 = new Thread(new CyclicBarrierRunner(cb, 2));
			t2.setName("Passenger 2");
			t2.start();
			Thread.sleep(1000);
			Thread t3 = new Thread(new CyclicBarrierRunner(cb, 3));
			t3.setName("Passenger 3");
			t3.start();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed");
	}

	private static void cyclicBarrierSimpleExample() {
		CyclicBarrier cb = new CyclicBarrier(3);

		try {
			{
				Thread t1 = new Thread(new CyclicBarrierRunner(cb, 1));
				t1.setName("Passenger 1");
				t1.start();
				Thread.sleep(1000);
				Thread t2 = new Thread(new CyclicBarrierRunner(cb, 2));
				t2.setName("Passenger 2");
				t2.start();
				Thread.sleep(1000);
				Thread t3 = new Thread(new CyclicBarrierRunner(cb, 3));
				t3.setName("Passenger 3");
				t3.start();
				Thread.sleep(1000);
			}
			{
				Thread t1 = new Thread(new CyclicBarrierRunner(cb, 1));
				t1.setName("Passenger 1");
				t1.start();
				Thread.sleep(1000);
				Thread t2 = new Thread(new CyclicBarrierRunner(cb, 2));
				t2.setName("Passenger 2");
				t2.start();
				Thread.sleep(1000);
				Thread t3 = new Thread(new CyclicBarrierRunner(cb, 3));
				t3.setName("Passenger 3");
				t3.start();
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("last");

	}
}

class CyclicBarrierRunner implements Runnable {
	private CyclicBarrier cb;
	private int iCount;

	public CyclicBarrierRunner(CyclicBarrier cb, int i) {
		this.cb = cb;
		this.iCount = i;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " has arrived !!!");
		try {
			cb.await();
			System.out.println("Since all have come now cab will go with " + Thread.currentThread().getName());
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}

class CyclicBarrierFinishEvent implements Runnable {
	public void run() {

		System.out.println(
				"As 3 threads have reached common barrier point " + ", CyclicBarrrierFinishEvent has been triggered");
		System.out.println("You can update shared variables if any");
	}

}
