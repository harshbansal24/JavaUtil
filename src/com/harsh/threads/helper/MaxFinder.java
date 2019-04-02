package com.harsh.threads.helper;

import java.util.concurrent.RecursiveTask;

public class MaxFinder extends RecursiveTask<Integer> {

	private static final long serialVersionUID = 6246185002696353884L;
	private int[] data;
	private int start;
	private int end;

	public MaxFinder(int[] data, int start, int end) {
		super();
		this.data = data;
		this.start = start;
		this.end = end;
	}

	public MaxFinder(int[] data) {
		this(data, 0, data.length);
	}

	@Override
	protected Integer compute() {
		final int length = end - start;
		if (length < 5) {
			return computeDirectly();
		}
		final int split = length / 2;

		final MaxFinder left = new MaxFinder(data, start, start + split);
		left.fork();
		final MaxFinder right = new MaxFinder(data, start + split, end);
		return Math.max(right.invoke(), left.join());
	}

	private int computeDirectly() {
//		System.out.println("Computing " + Thread.currentThread().getName() + " start=" + start + " end=" + end);
		int max = Integer.MIN_VALUE;
		for (int i = start; i < end; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		return max;
	}

}
