package org.harsh.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ListFilesInJar {
	private static void process(InputStream input, String string) throws IOException {
		InputStreamReader isr = new InputStreamReader(input);
		BufferedReader reader = new BufferedReader(isr);
		String line;
		boolean bFlag = true;
		while ((line = reader.readLine()) != null) {
			if (line.contains("account")) {
				if (bFlag) {
					System.out.println("==============================");
					System.out.println("File Name :::::" + string);
					bFlag = false;
				}
				System.out.println(line);
			}
		}
		reader.close();
	}

	public static void main(String arg[]) throws IOException {
		JarFile jarFile = new JarFile("c:/temp/efs.jar");

		final Enumeration<JarEntry> entries = jarFile.entries();
		while (entries.hasMoreElements()) {
			final JarEntry entry = entries.nextElement();
			JarEntry fileEntry = jarFile.getJarEntry(entry.getName());
			InputStream input = jarFile.getInputStream(fileEntry);
			process(input, entry.getName());
		}
	}
}
