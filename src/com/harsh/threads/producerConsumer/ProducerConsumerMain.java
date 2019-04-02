/**
 * 
 */
package com.harsh.threads.producerConsumer;

import java.util.Vector;

public class ProducerConsumerMain {

	public ProducerConsumerMain() {
	}

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		int max = 4;
		Thread producer = new Producer(vector, max);
		Thread consumer = new Consumer(vector, max);
		producer.start();
		consumer.start();
	}
}