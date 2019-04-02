package com.harsh.util;

public class AllStringOperations {

	/**
	 * this method reverses the string by 3 ways.
	 */
	public static void javaReverseString() {
		String str = "Harsh";
		{
			StringBuilder st = new StringBuilder(str);
			System.out.println("---REVERSE STRING BY STRING BUILDER---" + st.reverse().toString());
		}
		{
			System.out.println("---REVERSE STRING BY CHAR AARAY---");
			char[] charArray = str.toCharArray();
			char[] charArrayReverse = new char[charArray.length];
			for (int i = charArray.length; i > 0; i--) {
				charArrayReverse[charArray.length - i] = charArray[i - 1];
			}
			for (int i = 0; i < charArrayReverse.length; i++) {
				System.out.println(charArrayReverse[i]);
			}
		}
		{
			System.out.println("---REVERSE STRING BY RECURSIVE METHOD---" + reverseStringRecursive(str));
		}
	}

	private static String reverseStringRecursive(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		return reverseStringRecursive(str.substring(1)) + str.charAt(0);
	}
}
