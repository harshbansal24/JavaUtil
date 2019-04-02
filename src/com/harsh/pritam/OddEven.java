package com.harsh.pritam;

public class OddEven {
	public static void main(String[] args) {
		Demo3 o = new Demo3();
		Thread even = new Thread(new MyRunnable3(2, o));
		Thread odd = new Thread(new MyRunnable3(1, o));
		even.setName("Thread_2");
		// even.setPriority(1);
		even.start();
		odd.setName("Thread_1");
		odd.start();
	}
}

class MyRunnable3 implements Runnable {
	int start;
	Demo3 ob;

	MyRunnable3(int s, Demo3 o) {
		start = s;
		ob = o;
	}

	public void run() {
		for (int i = start; i <= 10; i += 2)
			ob.display(i);
	}
}

class Demo3 {
	int rem = 0;

	synchronized void display(int i) {
		System.out.println(Thread.currentThread().getName() + "Enter");
		while (i % 2 == rem)
			try {
				wait();
			} catch (Exception e) {
				System.out.println("Display interrupted");
			}
		System.out.println(i + " By " + Thread.currentThread().getName());
		rem = i % 2;
		notify();
		System.out.println(Thread.currentThread().getName() + "Exit");
	}
}