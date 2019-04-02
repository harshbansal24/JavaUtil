package com.harsh.threads.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue extends Thread {
	private BlockingQueue<Integer> blockingQueue;

	public ConsumerBlockingQueue(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Integer outvalue;
			try {
				outvalue = this.blockingQueue.take();
				System.out.println("Consumed " + outvalue);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
