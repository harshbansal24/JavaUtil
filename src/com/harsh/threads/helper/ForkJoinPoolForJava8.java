package com.harsh.threads.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolForJava8 extends RecursiveTask<Integer> {

	private static final long serialVersionUID = 9176828387205905946L;
	private List<Integer> list;

	public ForkJoinPoolForJava8(List<Integer> list) {
		this.list = Objects.requireNonNull(list);
	}

	@Override
	protected Integer compute() {
		if (list.size() > 4) {
			return ForkJoinTask.invokeAll(createSubTasks()).stream().mapToInt(ForkJoinTask::join).sum();
		} else {
			return processing(list);
		}
	}

	private Integer processing(List<Integer> list2) {
		return list2.stream().reduce(0, Integer::sum);
	}

	private Collection<ForkJoinPoolForJava8> createSubTasks() {
		List<ForkJoinPoolForJava8> listForkJoinPoolForJava8 = new ArrayList<>();
		listForkJoinPoolForJava8.add(new ForkJoinPoolForJava8(list.subList(0, list.size() / 2)));
		listForkJoinPoolForJava8.add(new ForkJoinPoolForJava8(list.subList(list.size() / 2, list.size())));
		return listForkJoinPoolForJava8;
	}

}
