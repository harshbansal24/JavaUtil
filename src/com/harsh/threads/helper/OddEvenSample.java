package com.harsh.threads.helper;

public class OddEvenSample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		new Thread(new Even(printer, 20)).start();
		new Thread(new Odd(printer, 20)).start();
	}
}

class Even implements Runnable {

	private Printer printer;
	private int iMax;

	public Even(Printer printer, int i) {
		this.printer = printer;
		this.iMax = i;
	}

	@Override
	public void run() {
		for (int i = 2; i <= iMax; i = i + 2) {
			try {
				printer.printEven(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Odd implements Runnable {
	private Printer printer;
	private int iMax;

	public Odd(Printer printer, int i) {
		this.printer = printer;
		this.iMax = i;
	}

	@Override
	public void run() {
		for (int i = 1; i <= iMax; i = i + 2) {
			try {
				printer.printOdd(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Printer {
	private boolean bEven = true;

	public void printOdd(int i) throws InterruptedException {
		synchronized (this) {
			if (!bEven) {
				wait();
			}
			System.out.println(i + " ODD");
			bEven = false;
			notify();
		}
	}

	public void printEven(int i) throws InterruptedException {
		synchronized (this) {
			if (bEven) {
				wait();
			}
			System.out.println(i + " EVEN");
			bEven = true;
			notify();
		}
	}
}