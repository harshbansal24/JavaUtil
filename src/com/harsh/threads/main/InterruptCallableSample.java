package com.harsh.threads.main;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InterruptCallableSample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		System.out.println("Starting..........");
		Future<Void> future = executor.submit(new Callable<Void>() {
			Random ran = new Random();

			@Override
			public Void call() throws Exception {
				for (int i = 0; i < 1E8; i++) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						System.out.println("Interuppted called");
						break;
					}
					Math.pow(ran.nextDouble(), ran.nextDouble());
				}
				return null;
			}
		});
		executor.shutdown();
		// Cancel should be having true.
		future.cancel(true);
		System.out.println("Stopped............");
	}

}
