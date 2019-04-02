package com.harsh.threads.helper;

import com.harsh.threads.main.SemaphoreImpl;

public class SemaphoreImplExample extends Thread {

	private SemaphoreImpl semaphoreImpl;

	public SemaphoreImplExample(SemaphoreImpl semaphoreImpl) {
		this.semaphoreImpl = semaphoreImpl;
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			semaphoreImpl.down();
			System.out.println("---Thread Inside ---" + Thread.currentThread().getName());
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			semaphoreImpl.up();
			System.out.println("---Thread Exiting---" + Thread.currentThread().getName());
		}
	}

}
