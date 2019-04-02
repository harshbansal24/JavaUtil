package com.assignment.ideas.test.junit;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.assignment.ideas.file.input.InputFileProcessor;
import com.assignment.ideas.model.SoftwareOnServerDetailsModel;

public class InputFileProcessorTest {
	String strFilname = "C://Harsh//Personal//Data//Workspace8//SampleJava8Prjt//input.txt";

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void processTC1() {
		InputFileProcessor fileProcessor = new InputFileProcessor(strFilname);
		fileProcessor.process();
	}

	/**
	 * Checking presence of file
	 */
	@Test
	public void processTC2() {
		strFilname += "test";
		InputFileProcessor fileProcessor = new InputFileProcessor(strFilname);
		fileProcessor.process();
	}

	@Test
	public void processTC3() {
		InputFileProcessor fileProcessor = new InputFileProcessor(strFilname);
		Assert.assertEquals(3, fileProcessor.process().size());
	}

	@Test
	public void processTC4() {
		InputFileProcessor fileProcessor = new InputFileProcessor(strFilname);
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = fileProcessor.process();
		Assert.assertEquals(3, processInputData.size());
	}

	@Test
	public void processTC6() {
		InputFileProcessor fileProcessor = new InputFileProcessor(strFilname);
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = fileProcessor.process();
		double getiVersion = processInputData.get("Python").get(0).getiVersion();
		Assert.assertEquals("2.63", String.valueOf(getiVersion));
	}

	@Test
	public void processTC7() {
		InputFileProcessor fileProcessor = new InputFileProcessor(strFilname);
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = fileProcessor.process();
		Assert.assertEquals(3, processInputData.get("Ubuntu").size());
	}
}
