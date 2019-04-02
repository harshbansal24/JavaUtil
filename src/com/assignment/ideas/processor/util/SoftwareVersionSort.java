package com.assignment.ideas.processor.util;

import java.util.Comparator;

import com.assignment.ideas.model.SoftwareOnServerDetailsModel;



public class SoftwareVersionSort implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		SoftwareOnServerDetailsModel s1 = (SoftwareOnServerDetailsModel) o1;
		SoftwareOnServerDetailsModel s2 = (SoftwareOnServerDetailsModel) o2;
		if (s1.getiVersion() > s2.getiVersion()) {
			return -1;
		}
		return 0;
	}

}
