package com.assignment.ideas.processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.assignment.ideas.model.SoftwareOnServerDetailsModel;
import com.assignment.ideas.processor.util.SoftwareVersionSort;



public class DataProcessor {

	public List<String> getLatestVersion(Map<String, List<SoftwareOnServerDetailsModel>> process) {
		Set<String> keySet = process.keySet();
		List<String> listSoftwareVer = new ArrayList<>();
		for (String key : keySet) {
			List<SoftwareOnServerDetailsModel> list = process.get(key);
			if (list.size() > 2) {
				calculateLatestVersion(listSoftwareVer, key, list);
			}
		}
		return listSoftwareVer;
	}

	private void calculateLatestVersion(List<String> listSoftwareVer, String key,
			List<SoftwareOnServerDetailsModel> list) {
		Collections.sort(list, new SoftwareVersionSort());
		double iMax = list.get(0).getiVersion();
		int count = 0;
		for (SoftwareOnServerDetailsModel softwareOnServerDetailsModel : list) {
			if (iMax > softwareOnServerDetailsModel.getiVersion()) {
				count++;
			}
		}
		if (count > 1) {
			listSoftwareVer.add(key);
		}
	}
}
