package com.harsh.threads.main;

public class SemaphoreImpl {

	public SemaphoreImpl(int value) {
		this.value = value;
	}

	private int value = 0;

	public synchronized void down() {
		if (value == 0) {
			try {
				System.out.println("---waiting---");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		value--;
		System.out.println("---down called---" + value);
	}

	public synchronized void up() {
		value++;
		System.out.println("---up called---" + value);
		notify();
	}
}
