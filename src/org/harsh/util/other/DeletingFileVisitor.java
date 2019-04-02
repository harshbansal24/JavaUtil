package org.harsh.util.other;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class DeletingFileVisitor extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
		if (attributes.isRegularFile()) {
			System.out.println("Deleting Regular File: " + file.getFileName());
			try {
				Files.delete(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path directory, IOException ioe) {
		System.out.println("Deleting Directory: " + directory.getFileName());
		try {
			Files.delete(directory);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException ioe) {
		System.out.println("Something went wrong while working on : " + file.getFileName());
		ioe.printStackTrace();
		return FileVisitResult.CONTINUE;
	}
}