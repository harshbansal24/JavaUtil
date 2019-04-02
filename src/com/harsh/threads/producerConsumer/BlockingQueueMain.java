/**
 * 
 */
package com.harsh.threads.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author C5190459
 *
 */
public class BlockingQueueMain {

	/**
	 * 
	 */
	public BlockingQueueMain() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
		ProducerBlockingQueue producer = new ProducerBlockingQueue(blockingQueue);
		ConsumerBlockingQueue consumer = new ConsumerBlockingQueue(blockingQueue);
		producer.start();
		consumer.start();
	}

}
