package com.harsh.threads.helper;

public class ThreadPoolExample implements Runnable {

	private int i = 0;

	public ThreadPoolExample(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println("Start " + this.i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End " + this.i);
	}

}
