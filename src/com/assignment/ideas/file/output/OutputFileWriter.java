package com.assignment.ideas.file.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFileWriter {

	public OutputFileWriter() {
	}

	public void outputFileWrite(List<String> latestVersion, String strOutputFileName) {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(strOutputFileName, false))) {
			for (String strData : latestVersion) {
				out.write(strData);
				out.write("\n");
			}
		} catch (IOException e) {
			System.out.println("File couldn't be written");
		}

	}

}
