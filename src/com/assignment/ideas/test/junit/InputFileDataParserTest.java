package com.assignment.ideas.test.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.assignment.ideas.file.input.InputFileDataParser;
import com.assignment.ideas.model.SoftwareOnServerDetailsModel;

public class InputFileDataParserTest {
	static List<String> inputFileReaderData = new ArrayList<>();

	@BeforeClass
	public static void setup() {
		inputFileReaderData.add("Server1, Database, MySQL, 5.5");
		inputFileReaderData.add("Server2, Database, MySQL, 5.1");
		inputFileReaderData.add("Server3, OS, Ubuntu, 10.04");
		inputFileReaderData.add("Server1, OS, Ubuntu, 10.04");
		inputFileReaderData.add("Server2, OS, Ubuntu, 12.04");
		inputFileReaderData.add("Server3, Language, Python, 2.6.3");
		inputFileReaderData.add("Server4, Language, Java, 5");
	}

	@Test
	public void processInputDataTC1() {
		InputFileDataParser dataParser = new InputFileDataParser();
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = dataParser
				.processInputData(new ArrayList<>());
		Assert.assertEquals(0, processInputData.size());
	}

	@Test
	public void processInputDataTC2() {
		InputFileDataParser dataParser = new InputFileDataParser();
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = dataParser
				.processInputData(inputFileReaderData);
		Assert.assertEquals(4, processInputData.size());
	}

	/**
	 * For checking 2.6.3 is converted into 2.63
	 */
	@Test
	public void processInputDataTC3() {
		InputFileDataParser dataParser = new InputFileDataParser();
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = dataParser
				.processInputData(inputFileReaderData);
		double getiVersion = processInputData.get("Python").get(0).getiVersion();
		Assert.assertEquals("2.63", String.valueOf(getiVersion));
	}

	@Test
	public void processInputDataTC4() {
		InputFileDataParser dataParser = new InputFileDataParser();
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = dataParser
				.processInputData(inputFileReaderData);
		Assert.assertEquals(3, processInputData.get("Ubuntu").size());
	}

	/**
	 * Test case for incorrect input
	 */
	@Test(expected = AssertionError.class)
	public void processInputDataTC5() {
		InputFileDataParser dataParser = new InputFileDataParser();
		inputFileReaderData.add("Server6, Language, Dot Net");
		Map<String, List<SoftwareOnServerDetailsModel>> processInputData = dataParser
				.processInputData(inputFileReaderData);
		Assert.assertEquals(5, processInputData.size());
	}

}
