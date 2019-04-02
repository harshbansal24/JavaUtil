package com.assignment.ideas.file.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFileReader {

	private String strFileName;

	public InputFileReader(String strFileName) {
		this.strFileName = strFileName;
	}

	public List<String> inputFileReader() {
		List<String> list = new ArrayList<>();
		File file = new File(strFileName);
		String fileContent;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			list = new ArrayList<>();
			while ((fileContent = bufferedReader.readLine()) != null) {
				list.add(fileContent);
			}
		} catch (IOException e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("File Not present " + strFileName);
			} else {
				System.out.println("Error Processing File");
			}
		}
		return list;
	}

}
