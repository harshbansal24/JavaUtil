package com.harsh.threads.main;

import java.util.Random;

public class InterruptThreadSample {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Runnable() {
			Random ran = new Random();

			@Override
			public void run() {
				for (int i = 0; i < 1E4; i++) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						System.out.println("Interuppted called");
						break;
					}
					Math.pow(ran.nextDouble(), ran.nextDouble());
				}
				System.out.println("Completed");
			}
		});
		System.out.println("Starting........");
		t.start();
		Thread.sleep(5000);
		// Only when there is Thread.sleep than only interrupted is called.
		t.interrupt();

		System.out.println("Stopped.....");
	}

}
