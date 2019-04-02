package com.harsh.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSample {
	public static void main(String[] args) {
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
			if (iCount == 2) {
				cb.reset();
			}
			cb.await();
			System.out.println("Since all have come now cab will go with " + Thread.currentThread().getName());
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}