package com.harsh.threads.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue extends Thread {
	private BlockingQueue<Integer> blockingQueue;

	public ProducerBlockingQueue(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Producing " + i);
				this.blockingQueue.put(i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
