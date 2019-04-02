package com.harsh.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class AllFileOperations {
	public static void main(String[] args) {
		javaFileLockExample();
	}

	/**
	 * This method shows how to create a lock on file.
	 */
	private static void javaFileLockExample() {
		FileChannel fc;
		RandomAccessFile randomAccessFile;
		ByteBuffer byteBuffer = null;

		String strData = "Test by Harsh";
		String strFileNm = "C:\\temp\\60+ Popular Java Interview Programs With Solutions.html";
		try {
			randomAccessFile = new RandomAccessFile(strFileNm, "rw");
			fc = randomAccessFile.getChannel();
			try (FileLock fileLock = fc.tryLock()) {
				if (null != fileLock) {
					byteBuffer = ByteBuffer.wrap(strData.getBytes());
					byteBuffer.put(strData.getBytes());
					byteBuffer.flip();
					while (byteBuffer.hasRemaining()) {
						fc.write(byteBuffer);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

	}
}
