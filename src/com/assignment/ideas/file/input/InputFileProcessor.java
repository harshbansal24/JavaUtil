package com.assignment.ideas.file.input;

import java.util.List;
import java.util.Map;

import com.assignment.ideas.model.SoftwareOnServerDetailsModel;



public class InputFileProcessor {

	private InputFileReader inputFileReader;
	private InputFileDataParser inputFileParser;

	public InputFileProcessor(String strFileName) {
		inputFileReader = new InputFileReader(strFileName);
		inputFileParser = new InputFileDataParser();
	}

	public Map<String, List<SoftwareOnServerDetailsModel>> process() {
		List<String> inputFileReaderData = inputFileReader.inputFileReader();
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = inputFileParser
				.processInputData(inputFileReaderData);
		return processInputData;
	}
}