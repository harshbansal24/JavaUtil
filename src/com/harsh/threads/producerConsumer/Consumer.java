package com.harsh.threads.producerConsumer;

import java.util.Vector;

public class Consumer extends Thread {
	Vector<Integer> vector;
	int maxSize;

	Consumer(Vector vector, int maxSize) {
		this.vector = vector;
		this.maxSize = maxSize;
	}

	public void run() {
		System.out.println("Inside Consumer Class");
		for (int i = 0; i < 6; i++) {
			consume(i);
		}
	}

	private void consume(int i) {
		if (vector.isEmpty()) {
			try {
				synchronized (vector) {
					vector.wait(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		synchronized (vector) {
			vector.remove(0);
			vector.notifyAll();
			System.out.println("Removed from Consumer " + i);
		}
	}

}
