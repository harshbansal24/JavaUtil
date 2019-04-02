package com.assignment.ideas.test.junit;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.assignment.ideas.file.input.InputFileReader;

public class InputFileReaderTest {
	private String strFilname = "C://Harsh//Personal//Data//Workspace8//SampleJava8Prjt//input.txt";
	private String strFilnameEmpty = "C://Harsh//Personal//Data//Workspace8//SampleJava8Prjt//input2.txt";

	@BeforeClass
	public static void setup() {
	}

	@Test
//	@Parameters(method="parametersForAddProducesCorrectValue_usingMethodParametersWithoutName")
	public void inputFileReaderTC1() {
		InputFileReader inputFileReader = new InputFileReader(strFilname);
		inputFileReader.inputFileReader();
	}

	@Test(expected = NullPointerException.class)
	public void inputFileReaderTC2() {
		InputFileReader inputFileReader = new InputFileReader(null);
		inputFileReader.inputFileReader();
	}

	@Test
	public void inputFileReaderTC3() {
		InputFileReader inputFileReader = new InputFileReader(strFilname);
		List<String> inputFileReader2 = inputFileReader.inputFileReader();
		Assert.assertEquals(8, inputFileReader2.size());
	}

	@Test
	public void inputFileReaderTC4() {
		InputFileReader inputFileReader = new InputFileReader(strFilnameEmpty);
		List<String> inputFileReader2 = inputFileReader.inputFileReader();
		Assert.assertEquals(0, inputFileReader2.size());
	 }
	
	
	 private Object[] parametersForAddProducesCorrectValue_usingMethodParametersWithoutName() {
	        return new Object[]{
	                new Object[]{strFilname},
	                new Object[]{strFilnameEmpty}
	        };
	    }
}
