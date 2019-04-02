package org.harsh.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.lang.time.StopWatch;

public class BackUPClass {

	public BackUPClass() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		javaNIOFilesModifiedAfter();
	}

	/**
	 * This method lists the files which are modified after a particular date in the directory provided. There are 2
	 * ways to achive it, one by using the Apache fileutil class and another is by using the NIO from java 7
	 */
	private static void javaNIOFilesModifiedAfter() {
		ZipOutputStream output = null;
		FileOutputStream destination = null;
		int BUFFER_SIZE = 2048;
		StopWatch stopWatch = new StopWatch();
		String strLocation = "C:/repository/Deliverables/Regional/eBanking/trunk";
		System.out.println("Checking Folder for File Upload is " + strLocation);
		// strLocation = "C:/repository";
		File file = new File(strLocation);
		final List<String> listFileNames = new ArrayList<String>();
		final Calendar calendar = new GregorianCalendar(2014, Calendar.APRIL, 28);

		if (file.exists()) {
			// using the below process it takes a lot of time in case there are lots of files
			// stopWatch.start();
			// Collection files = FileUtils.listFiles(file, new RegexFileFilter("^(.*?)"),
			// DirectoryFileFilter.DIRECTORY);
			// for (Object object : files) {
			// System.out.println(object.toString());
			// }
			// stopWatch.stop();
			// System.out.println(stopWatch.getTime());
			// stopWatch.reset();

			// This piece of code just provide the file listing on that directory. Doesn't go inside the sub directories
			// stopWatch.start();
			// Path dir = FileSystems.getDefault().getPath(strLocation);
			// DirectoryStream<Path> stream;
			// try {
			// stream = Files.newDirectoryStream(dir);
			// for (Path path : stream) {
			// System.out.println(path.getFileName());
			// }
			// stream.close();
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
			// stopWatch.stop();
			// System.out.println(stopWatch.getTime());
			// stopWatch.reset();

			stopWatch.start();
			final Path rootDir = Paths.get(strLocation);
			// Walk thru mainDir directory
			try {
				Files.walkFileTree(rootDir, new FileVisitor<Path>() {
					// First (minor) speed up. Compile regular expression pattern only one time.
					private Pattern pattern = Pattern.compile("^(.*?)");

					@Override
					public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes atts) throws IOException {
						boolean matches = pattern.matcher(path.toString()).matches();
						return (matches) ? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
					}

					@Override
					public FileVisitResult visitFile(Path path, BasicFileAttributes mainAtts) throws IOException {
						boolean matches = pattern.matcher(path.toString()).matches();
						if (matches) {
							boolean bFlag = checkIfFileModified(calendar, path.toFile().lastModified());
							if (bFlag) {
								listFileNames.add(path.toString());
							}
						}
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException {
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFileFailed(Path path, IOException exc) throws IOException {
						exc.printStackTrace();
						return path.equals(rootDir) ? FileVisitResult.TERMINATE : FileVisitResult.CONTINUE;
					}
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		stopWatch.stop();
		System.out.println("Time taken in milli seconds to find the files " + (stopWatch.getTime()/1000));
		System.out.println("Number of Files Modified after " + calendar.getTime().toString() + " are "
				+ listFileNames.size());

		stopWatch.reset();
		stopWatch.start();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMDD_HHMMSS");
		Date date = new Date();
		String strFileNm = "C:/Harsh/SAP/Backup_files/ebanking-Code/FileModifiedAfter_" + calendar.get(Calendar.DAY_OF_MONTH)
				+ calendar.get(Calendar.MONTH) + calendar.get(Calendar.YEAR) + "_BackupTime_"
				+ simpleDateFormat.format(date);
		String strZipFile = strFileNm + ".zip";
		String strTxtFile = strFileNm + ".txt";
		if (listFileNames != null && listFileNames.size() > 0) {
			Object[] strFiles = listFileNames.toArray();
			BufferedInputStream origin = null;
			File fileTextNm = new File(strTxtFile);
			BufferedWriter out = null;
			try {
				destination = new FileOutputStream(strZipFile);
				output = new ZipOutputStream(new BufferedOutputStream(destination));
				FileInputStream inStream = null;
				ZipEntry entry = null;
				int count;
				byte[] data = new byte[BUFFER_SIZE];
				if (!fileTextNm.exists()) {
					fileTextNm.createNewFile();
				}
				out = new BufferedWriter(new FileWriter(fileTextNm, true));
				for (Object string : strFiles) {
					String strFile = string.toString();
					out.write(strFile);
					out.write("\n");
					inStream = new FileInputStream(strFile);
					origin = new BufferedInputStream(inStream, BUFFER_SIZE);
					// entry = new ZipEntry(string.toString().substring(string.toString().lastIndexOf("\\") + 1));
					// System.out.println(strFile.substring(3,strFile.length()));
					// entry = new ZipEntry(string.toString());
					entry = new ZipEntry(strFile.substring(3, strFile.length()));
					output.putNextEntry(entry);

					while ((count = origin.read(data, 0, BUFFER_SIZE)) != -1) {
						output.write(data, 0, count);
					}
				}
				System.out.println("Zip created at " + strZipFile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (origin != null)
						origin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (output != null) {
					try {
						output.closeEntry();
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			stopWatch.stop();
			System.out.println("Time taken in milli seconds to create a Zip File " + (stopWatch.getTime()/1000));
		} else {
			System.out.println("No file is modified");
		}
	}

	/**
	 * @param calendar
	 * @param longTimeModifiedl
	 * @return
	 */
	protected static boolean checkIfFileModified(Calendar calendar, long longTimeModifiedl) {
		boolean b = false;
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(longTimeModifiedl);
		b = cal.after(calendar);
		return b;
	}

}
