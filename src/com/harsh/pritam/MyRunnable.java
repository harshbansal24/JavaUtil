package com.harsh.pritam;

public class MyRunnable implements Runnable {
	public static int counter = 0;
	public static int turn = 0;
	public static Object lock = new Object();

	@Override
	public void run() {
		while (counter < 20) {
			synchronized (lock) {
				if (turn == 0) {
					System.out.println(counter + " from thread " + Thread.currentThread().getName());
					turn = 1;
					try {
						counter++;
						lock.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				} else {
					turn = 0;
					lock.notify();
				}

			}
		}
	}

	public static void main(String[] args) {
		Thread threadA = new Thread(new MyRunnable());
		threadA.setName("Thread_1");
		Thread threadB = new Thread(new MyRunnable());
		threadB.setName("Thread_2");
		threadA.start();
		threadB.start();
	}
}