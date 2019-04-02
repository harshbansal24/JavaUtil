package com.assignment.ideas.file.output;

import java.util.List;

import com.assignment.ideas.util.AppUtil;



public class OutputFIleProcessor {

	private static OutputFileWriter outputFileWriter;

	public OutputFIleProcessor() {

	}

	public static void processOutput(List<String> latestVersion, String strFileName) {
		outputFileWriter = new OutputFileWriter();
		outputFileWriter.outputFileWrite(latestVersion,AppUtil.getFileLocation(strFileName));
	}

}
