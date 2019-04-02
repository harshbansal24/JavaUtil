package com.assignment.tomtom;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TomTomAssignment {

	public static void main(String[] args) {
		TomTomAssignment testClassJava8 = new TomTomAssignment();
		System.out.println(testClassJava8.solution("13 DUP 4 POP 5 DUP + DUP + -"));
		System.out.println(testClassJava8.solution("5 6 + -"));
		System.out.println(testClassJava8.solution("3 DUP 5 - -"));
	}

	public int solution(String S) {
		List<String> strTotal = new ArrayList<>();
		
		if (S == null || S.length() == 0) {
			return -1;
		} else {
			String[] strValue = S.split(" ");

			String strToken = "";
			for (String string : strValue) {
				boolean bFlag = false;
				bFlag = checkNumber(string);
				if (bFlag) {
					strToken = string;
					strTotal.add(strToken);
					System.out.println("push " + string);
				} else {
					if (checkDupPoo(string) == 0) {
						System.out.println("duplicate " + strToken);
						strTotal.add(strToken);
					} else if (checkDupPoo(string) == 1) {
						operatePop(strTotal, strToken);
					} else if (checkDupPoo(string) == 2) {
						switch (string) {
						case "+":
							if ("-1".equals(operateForOperator(strTotal, string))){
								return -1;
							}
							strToken = strTotal.get(strTotal.size() - 1);
							break;
						case "-":
							if ("-1".equals(operateForOperator(strTotal, string))){
								return -1;
							}
							strToken = strTotal.get(strTotal.size() - 1);
							break;
						}
					}
				}
			}
		}
		return Integer.parseInt(strTotal.get(strTotal.size() - 1));
	}

	private String operateForOperator(List<String> strTotal, String string) {
		if (strTotal.size() == 2) {
			return "-1";
		}
		int iFirst = Integer.parseInt(strTotal.get(strTotal.size() - 1));
		int iSecond = Integer.parseInt(strTotal.get(strTotal.size() - 2));
		int iAddSum = 0;
		if ("+".equals(string)) {
			iAddSum = iFirst + iSecond;
			System.out.println("add " + iFirst + " and " + iSecond);
		} else if ("-".equals(string)) {
			iAddSum = iFirst - iSecond;
			System.out.println("subtract " + iFirst + " and " + iSecond);
		}
		strTotal.remove(strTotal.size() - 1);
		strTotal.remove(strTotal.size() - 1);
		strTotal.add(String.valueOf(iAddSum));
		return "0";
	}

	private void operatePop(List<String> strTotal, String strToken) {
		strTotal.remove(strToken);
		System.out.println("pop " + strToken);
	}

	private int checkDupPoo(String string) {
		switch (string) {
		case "DUP":
			return 0;
		case "POP":
			return 1;
		}
		return 2;
	}

	private boolean checkNumber(String string) {
		String regularExpression = "^[0-9]*$";
		Pattern p = Pattern.compile(regularExpression);
		Matcher matcher = p.matcher(string);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
}