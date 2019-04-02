package com.harsh.threads.helper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFrameworkFilesInDIr extends RecursiveTask<List<String>> {

	private static final long serialVersionUID = 4569650165900787540L;

	private final String strLocation;

	public ForkJoinFrameworkFilesInDIr(String strLocation) {
		super();
		this.strLocation = strLocation;
	}

	@Override
	protected List<String> compute() {
		List<String> list = new ArrayList<String>();
		List<ForkJoinFrameworkFilesInDIr> listFork = new ArrayList<>();
		File file = new File(strLocation);
		File[] listFiles = file.listFiles();
		if (listFiles != null) {
			for (File file2 : listFiles) {
				if (file2.isDirectory()) {
					ForkJoinFrameworkFilesInDIr forkJoinFrameworkFilesInDIr = new ForkJoinFrameworkFilesInDIr(
							file2.getAbsolutePath());
					forkJoinFrameworkFilesInDIr.invoke();
					listFork.add(forkJoinFrameworkFilesInDIr);
				} else {
					list.add(file2.toString());
				}
			}
		}
		addSubRecords(list, listFork);
		return list;
	}

	private void addSubRecords(List<String> list, List<ForkJoinFrameworkFilesInDIr> listFork) {
		for (ForkJoinFrameworkFilesInDIr item : listFork) {
			list.addAll(item.join());
		}
	}
}