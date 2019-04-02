package com.assignment.ideas;

import java.util.List;
import java.util.Map;

import com.assignment.ideas.file.input.InputFileProcessor;
import com.assignment.ideas.file.output.OutputFIleProcessor;
import com.assignment.ideas.model.SoftwareOnServerDetailsModel;
import com.assignment.ideas.processor.DataProcessor;



public class OutDatedVersionFinder {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Input File Name not provided. Exiting the Porgram");
			System.exit(1);
		}
		String strFileName = args[0];
		DataProcessor dataProcessor = null;
		InputFileProcessor inputFileProcessor = new InputFileProcessor(strFileName);
		Map<String, List<SoftwareOnServerDetailsModel>> process = inputFileProcessor.process();
		if (process.size() == 0) {
			System.out.println("File doesn't have any data ");
			System.exit(1);
		}

		dataProcessor = new DataProcessor();
		List<String> latestVersion = dataProcessor.getLatestVersion(process);
		OutputFIleProcessor.processOutput(latestVersion,strFileName);
	}
}