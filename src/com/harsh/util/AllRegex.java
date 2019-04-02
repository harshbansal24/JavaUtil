package com.harsh.util;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllRegex {

	public void regexExamples() {

		String regularExpression = "[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}";
		regularExpression = "^[0-9]*$";
		regularExpression = "^\\\\d{1,9}$";
		regularExpression = "^\\\\d{0,9}$";
		regularExpression = "^[a-zA-Z0-9 ]+$";
		regularExpression = "^\\\\d*$";
		regularExpression = "^$|[a-zA-Z0-9]+$";
		// regularExpression="[a-zA-Z\s]+[a-zA-Z]+$";
		// regularExpression="^$|[a-zA-Z\s]+[a-zA-Z]+$";
		regularExpression = "^[0-9]{5}$";
		regularExpression = "[a-zA-Z ]*$";
		regularExpression = "^\\\\+[0-9]{2,30}$";
		regularExpression = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		regularExpression = "^[A-Z \\']+$";
		regularExpression = "^[0-9A-Z,\\./ \\']+$";
		regularExpression = "^$|[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}";
		regularExpression = "^[0-9]+$";
		regularExpression = "^[A-Z ,\\.\\']+$";
		regularExpression = "^[A-Z0-9 ,/\\.\\']+$";
		// regrex =
		// "^[_A-Za-z0-9-\+]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})$";
		String regex = ".*[^0-9].*"; // for a string with or without decimal
		regex = ".*\\D.*"; // for a string with or without decimal
		regex = "\\d\\d\\d\\d\\d\\d"; // String with six digits
		regex = "\\d{6}"; // String with six digits
		regex = ".*\\D.*"; // for a string with or without decimal
		regex = ".*\\D.*"; // for a string with or without decimal
		regex = "^[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"; // For
																		// domain
																		// name
																		// verification.
		regex = "^[([0-9]{3}[A-Za-z0-9]{4}[W,X,Y]{1}[A-Za-z0-9]{1})*$]+[([A-Za-z0-9]{2})]*$";
		CharSequence inputVariable = "987abcdW8ahk";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(inputVariable);

		if (m.matches()) {
			System.out.println(m.toString());
			System.out.println("Matched");
		} else {
			System.out.println("No match");
		}

		p = Pattern.compile("apple");
		m = p.matcher("applet");
		while (m.find())
			System.out
					.println("Found [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));

		// in a.b, the period metacharacter (.) represents any character that
		// appears between a and b.
		p = Pattern.compile(".ox");
		m = p.matcher("The quick brown fox jumps over the lazy ox.");
		while (m.find())
			System.out
					.println("Found [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));
		// The simple character class consists of characters placed side by side
		// and matches only those characters. For example, [abc] matches
		// characters a, b, and c.
		p = Pattern.compile("[csw]");
		m = p.matcher("cave");
		while (m.find())
			System.out
					.println("Found [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));

		// Negation character class----The negation character class begins with
		// the ^ metacharacter and matches only those characters not located in
		// that class. For example, [^abc] matches all characters except a, b,
		// and c.

		p = Pattern.compile("[^csw]");
		m = p.matcher("cave");
		while (m.find())
			System.out.println(
					"Found for ^csw [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));

		// Range character class ---The range character class consists of two
		// characters separated by a hyphen metacharacter (-). All characters
		// beginning with the character on the left of the hyphen and ending
		// with the character on the right of the hyphen belong to the range.
		// For example, [a-z] matches all lowercase alphabetic characters. It's
		// equivalent to specifying [abcdefghijklmnopqrstuvwxyz].
		p = Pattern.compile("[a-c]");
		m = p.matcher("clown");
		while (m.find())
			System.out.println(
					"Found for a-c [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));

		// Union character class ----The union character class consists of
		// multiple nested character classes and matches all characters that
		// belong to the resulting union. For example, [a-d[m-p]] matches
		// characters a through d and m through p
		p = Pattern.compile("[ab[c-e]]");
		m = p.matcher("abcdef");
		while (m.find())
			System.out.println("Found for ab[c-e] [" + m.group() + "] starting at " + m.start() + " and ending at "
					+ (m.end() - 1));

		// Intersection character class------The intersection character class
		// consists of characters common to all
		// nested classes and matches only common characters. For example,
		// [a-z&&[d-f]] matches characters d, e, and f.

		p = Pattern.compile("[aeiouy&&[y]]");
		m = p.matcher("party");
		while (m.find())
			System.out.println("Found for aeiouy [" + m.group() + "] starting at " + m.start() + " and ending at "
					+ (m.end() - 1));

		// Subtraction character class------The subtraction character class
		// consists of all characters except for those indicated in nested
		// negation character classes and matches the remaining characters. For
		// example, [a-z&&[^m-p]] matches characters a through l and q through
		// z:
		p = Pattern.compile("[a-f&&[^a-c]&&[^e]]");
		m = p.matcher("abcdefg");
		while (m.find())
			System.out.println(
					"Found for a-f [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));

		// Capturing groups--------A capturing group saves a match's characters
		// for later recall during pattern matching; this construct is a
		// character sequence surrounded by parentheses metacharacters ( ( ) ).
		// All characters within the capturing group are treated as a single
		// unit during pattern matching. For example, the (Java) capturing group
		// combines letters J, a, v, and a into a single unit. This capturing
		// group matches the Java pattern against all occurrences of Java in the
		// input text. Each match replaces the previous match's saved Java
		// characters with the next match's Java characters.
		// Capturing groups can be nested inside other capturing groups. For
		// example, in the (Java( language)) regex, ( language) nests inside
		// (Java). Each nested or non-nested capturing group receives its own
		// number, numbering starts at 1, and capturing groups are numbered from
		// left to right. In the example, (Java( language)) belongs to capturing
		// group number 1, and ( language) belongs to capturing group number 2.
		// In (a)(b), (a) belongs to capturing group number 1, and (b) belongs
		// to capturing group number 2.
		p = Pattern.compile("(Java( language)\2)");
		m = p.matcher("The Java language language");
		while (m.find())
			System.out.println("Found for Java-Lan\2 [" + m.group() + "] starting at " + m.start() + " and ending at "
					+ (m.end() - 1));

		// The ^ character indicates that the first three input text characters
		// must match the pattern's subsequent T, h, and e characters. Any
		// number of word characters may follow. Here is the output:
		p = Pattern.compile("^The\\w*");
		m = p.matcher("Therefore");
		while (m.find())
			System.out.println("Found for The\\w [" + m.group() + "] starting at " + m.start() + " and ending at "
					+ (m.end() - 1));

		// Zero-length matches---- You'll occasionally encounter zero-length
		// matches when working with quantifiers. For example, the following
		// greedy quantifier produces several zero-length matches:
		p = Pattern.compile("a?");
		m = p.matcher("abaa");
		while (m.find())
			System.out.println("Found for The\\w [" + m.group() + "] starting at " + m.start() + " and ending at "
					+ (m.end() - 1));

		System.out.println("Sample code for Split");
		p = Pattern.compile(",\\s");
		String[] fields = p.split("John Doe, 47, Hillsboro Road, 32000");
		for (int i = 0; i < fields.length; i++)
			System.out.println(fields[i]);

		System.out.println("Sample code for Split without \\s");
		p = Pattern.compile(",");
		fields = p.split("John Doe, 47, Hillsboro Road, 32000");
		for (int i = 0; i < fields.length; i++)
			System.out.println(fields[i]);

		System.out.println("Java8 way of using regex");
		List<String> progLangs = Arrays.asList("apl", "basic", "c", "c++", "c#", "cobol", "java", "javascript", "perl",
				"python", "scala");
		p = Pattern.compile("^c");
		progLangs.stream().filter(p.asPredicate()).forEach(System.out::println);

		System.out.println("---REPLACE IN REGEX---");
		p = Pattern.compile("(cat)");
		m = p.matcher("one cat, two cats, or three cats on a fence");
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "$1erpillar");
		}
		m.appendTail(sb);// this is required to add 'on a fence' in the end.
		System.out.println(sb);

		System.out.println("---USE OF REPLACE---");
		p = Pattern.compile("\\s+");
		m = p.matcher("Remove     the \t\t duplicate whitespace.   ");
		System.out.println(m.replaceAll(" "));

		System.out.println("---TESTING FOR GROUP COUNT METHOD---");
		p = Pattern.compile("a?");
		m = p.matcher("abaa");
		System.out.println("count is " + m.groupCount());
		while (m.find())
			System.out.println("Found for The\\w [" + m.group() + "] starting at " + m.start() + " and ending at "
					+ (m.end() - 1));
		
		// http://www.javaworld.com/article/3188545/learn-java/java-101-regular-expressions-in-java-part-1.html
		// http://www.javaworld.com/article/3195301/learn-java/java-101-regular-expressions-in-java-part-2.html
	}

	public static void main(String args[]) {
		new AllRegex().regexExamples();
	}

}
