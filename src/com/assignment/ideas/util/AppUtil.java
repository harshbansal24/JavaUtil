package com.assignment.ideas.util;

import org.apache.commons.lang.StringUtils;

public class AppUtil {

	public static String removeDoubleDots(String strValue) {
		String[] split = StringUtils.split(strValue, '.');
		if (split.length > 2) {
			strValue = "";
			for (int i = 0; i < split.length; i++) {
				if (i == 1) {
					strValue = strValue + "." + split[i];
				} else {
					strValue += split[i];
				}
			}
		}
		return strValue;
	}

	public static String getFileLocation(String strFileName) {
		int lastIndex = strFileName.lastIndexOf("\\");
		strFileName = strFileName.substring(0, lastIndex + 1) + "output.txt";
		return strFileName;
	}

}
