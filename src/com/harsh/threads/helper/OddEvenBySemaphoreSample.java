package com.harsh.threads.helper;

import java.util.concurrent.Semaphore;

public class OddEvenBySemaphoreSample implements Runnable {

	int iMax = 20;
	boolean bEvenOddFlag;
	static Semaphore semaphore1 = new Semaphore(1);
	static Semaphore semaphore2 = new Semaphore(0);

	public OddEvenBySemaphoreSample(boolean b) {
		this.bEvenOddFlag = b;
	}

	public static void main(String[] args) {
		Thread odd = new Thread(new OddEvenBySemaphoreSample(false),"Thread----1");
		Thread even = new Thread(new OddEvenBySemaphoreSample(true),"Thread----2");
		odd.start();
		even.start();
	}

	@Override
	public void run() {
		if (bEvenOddFlag) {
			try {
				printEven(iMax);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			try {
				printOdd(iMax);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void printOdd(int iValue) throws InterruptedException {
		int count = 1;
		for (int i = 1; i <= iValue; i = i + 2) {
			semaphore1.acquire(1);
			System.out.println(count);
			count = count + 2;
			semaphore2.release(1);
		}
	}

	private void printEven(int iValue) throws InterruptedException {
		int count = 2;
		for (int i = 2; i <= iValue; i = i + 2) {
			semaphore2.acquire(1);
			System.out.println(count);
			count = count + 2;
			semaphore1.release(1);
		}
	}
}