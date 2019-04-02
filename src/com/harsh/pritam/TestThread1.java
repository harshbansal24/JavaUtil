package com.harsh.pritam;

public class TestThread1 implements Runnable {
	Demo d;
	int flag = 0;

	TestThread1(Demo d, int flg) {
		this.d = d;
		this.flag = flg;
	}

	@Override
	public void run() {
		System.out.println("------");
		if (flag == 1)
			Demo.method1();
		if (flag == 2)
			d.method2();
	}

	public static void main(String args[]) {
		Demo d1 = new Demo();
		// Demo d2= new Demo();
		Thread t1 = new Thread(new TestThread(d1, 1));
		Thread t2 = new Thread(new TestThread(d1, 2));
		t1.start();
		t2.start();
	}
}

class Demo2 {
	public static int counter = 0;

	synchronized public static void method1() {
		counter++;
		System.out.println("method1:....");
	}

	synchronized public void method2() {
		try {
			Thread.sleep(10);
			for (int i = 0; i < 10; i++) {
				System.out.println("method2:" + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}