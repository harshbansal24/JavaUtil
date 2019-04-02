package com.harsh.threads.producerConsumer;

import java.util.Vector;

public class Producer extends Thread {
	Vector<Integer> vector;
	int maxSize;

	Producer(Vector vector, int maxSize) {
		this.vector = vector;
		this.maxSize = maxSize;
	}

	public void run() {
		System.out.println("Inside Producer Class");
		for (int i = 0; i < 6; i++) {
			produce(i);
		}
	}

	private void produce(int i) {
		while (vector.size() == maxSize) {
			try {
				synchronized (vector) {
					vector.wait(5000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		synchronized (vector) {
			vector.add(i);
			vector.notifyAll();
			System.out.println("Added to producer " + i);
		}

	}

}
