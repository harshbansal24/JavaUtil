package com.assignment.ideas.file.input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.assignment.ideas.model.SoftwareOnServerDetailsModel;
import com.assignment.ideas.util.AppUtil;


public class InputFileDataParser {

	public Map<String, List<SoftwareOnServerDetailsModel>> processInputData(List<String> inputFileReaderData) {
		Map<String, List<SoftwareOnServerDetailsModel>> map = new HashMap<>();
		for (String strData : inputFileReaderData) {
			String[] splitedData = StringUtils.split(strData, ',');
			if (splitedData.length == 4) {
				createBatchBySoftwareName(map, splitedData);
			}
		}
		return map;
	}

	private void createBatchBySoftwareName(Map<String, List<SoftwareOnServerDetailsModel>> map, String[] splitedData) {
		List<SoftwareOnServerDetailsModel> list = new ArrayList<>();
		String strVersion = AppUtil.removeDoubleDots(splitedData[3].trim());
		SoftwareOnServerDetailsModel softwareOnServerDetailsModel = new SoftwareOnServerDetailsModel(
				splitedData[1].trim(), Double.parseDouble(strVersion));
		String key = splitedData[2].trim();
		if (map.containsKey(key)) {
			List<SoftwareOnServerDetailsModel> list2 = map.get(key);
			list2.add(softwareOnServerDetailsModel);
			map.put(key, list2);
		} else {
			list.add(softwareOnServerDetailsModel);
			map.put(key, list);
		}
	}

}
