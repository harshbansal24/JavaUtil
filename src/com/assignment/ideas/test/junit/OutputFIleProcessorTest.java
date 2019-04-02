package com.assignment.ideas.test.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.assignment.ideas.file.output.OutputFIleProcessor;

public class OutputFIleProcessorTest {
	private String strFilname = "C://Harsh//Personal//Data//Workspace8//SampleJava8Prjt//input.txt";
	private String strFilnameWrong = "Z://Harsh//Personal//Data//Workspace8//SampleJava8Prjt//input.txt";

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void processOutputTC1() {
		List<String> latestVersion = new ArrayList<>();
		latestVersion.add("ubuntu");
		OutputFIleProcessor.processOutput(latestVersion, strFilname);
	}

	@Test
	public void processOutputTC2() {
		List<String> latestVersion = new ArrayList<>();
		latestVersion.add("ubuntu");
		OutputFIleProcessor.processOutput(latestVersion, strFilnameWrong);
	}
}
