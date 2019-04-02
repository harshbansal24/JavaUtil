package org.harsh.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 */

/**
 * @author Leena
 */
public class FileAddedAfter {
	static List<String> listFileOrgNm = new ArrayList<String>();

	/**
	 *
	 */
	public FileAddedAfter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strFileName = "c:\\HB\\To_HDD\\Harsh\\Video";
		String strFileCopyNm = "c:\\HB\\For_neha";
		File dir = new File(strFileName);
		FileAddedAfter.visitAllFiles(dir);
		for (String string : listFileOrgNm) {
			FileAddedAfter
				.copyFile(string, strFileCopyNm + string.substring(string.lastIndexOf("\\"), string.length()));
			// break;
		}
	}

	private static void visitAllFiles(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			Calendar c = new GregorianCalendar(2012, Calendar.AUGUST, 1);
			for (int i = 0; i < children.length; i++) {
				File f1 = new File(dir.toString() + File.separator + children[i]);
				if (f1.isFile()) {
					if (new Date(f1.lastModified()).compareTo(c.getTime()) == 1)
						listFileOrgNm.add(dir.toString() + File.separator + children[i]);
				}
				visitAllFiles(new File(dir, children[i]));
			}
		}
	}

	private static void copyFile(String src, String dst) {
		System.out.println(src);
		System.out.println(dst);
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dst);

			// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
