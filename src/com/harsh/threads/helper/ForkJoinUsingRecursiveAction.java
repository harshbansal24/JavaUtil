package com.harsh.threads.helper;

import java.io.File;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicLong;

public class ForkJoinUsingRecursiveAction extends RecursiveAction {

	private static final long serialVersionUID = -2038817264947825425L;

	private final File file;
	private final AtomicLong sizeAccumulator;

	public ForkJoinUsingRecursiveAction(File file, AtomicLong sizeAccumulator) {
		super();
		this.file = file;
		this.sizeAccumulator = sizeAccumulator;
	}

	@Override
	protected void compute() {
		if (file.isFile()) {
			sizeAccumulator.addAndGet(file.length());
		} else {
			final File[] fileName = file.listFiles();
			for (File file : fileName) {
				ForkJoinTask.invokeAll(new ForkJoinUsingRecursiveAction(file, sizeAccumulator));
			}
		}
	}

}
