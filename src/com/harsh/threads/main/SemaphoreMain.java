/**
 * 
 */
package com.harsh.threads.main;

import java.util.concurrent.Semaphore;

public class SemaphoreMain extends Thread {

	Semaphore semaphore = new Semaphore(1);

	public static void main(String[] args) {
		SemaphoreMain semaphoreMain = new SemaphoreMain();
		new Thread() {
			@Override
			public void run() {
				semaphoreMain.runMethod();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				semaphoreMain.runMethod();
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				semaphoreMain.runMethod();
			}
		}.start();
	}

	public void runMethod() {
		try {
			semaphore.acquire();
			// semaphore.tryAcquire();
			System.out.println("Started " + Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ending the" + Thread.currentThread().getName());
			semaphore.release();
		}

	}

}
