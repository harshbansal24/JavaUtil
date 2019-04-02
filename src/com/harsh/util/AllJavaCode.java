package com.harsh.util;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.GZIPInputStream;

import com.harsh.util.AllFileOperations;
import com.harsh.util.AllRegex;
import com.harsh.util.AllStringOperations;

public class AllJavaCode {

	public static void main(String[] args) throws IOException {
		// System.out.println(javaDaysBetween2Dates());
		// arrayCovariant();
		// collectionCovariant();
		// findMaxRepeatedWordsSortedByCount();
		// modifyStringWithoutCreatingNew();
		// unCompressFromGZIP();
		// javaGenerics();
		// javaReadFileMostEfficently();
		// javaRegex();
		// javaZoneSample();
		javaStringOperations();
		javaFileoperations();

	}

	private static void javaStringOperations() {
		javaReverseString();
		modifyStringWithoutCreatingNew();

	}

	private static void javaFileoperations() {
		AllFileOperations.main(null);
	}

	/**
	 * this method reverses the string by 3 ways.
	 */
	private static void javaReverseString() {
		AllStringOperations.javaReverseString();
	}

	/**
	 * This method shows the Zone implementation with dates.
	 */
	private static void javaZoneSample() {
		{
			LocalDateTime utcDateTime = LocalDateTime.of(2015, 05, 15, 9, 0);

			ZoneId zoneLA = ZoneId.of("America/Los_Angeles");
			ZoneId zoneBerlin = ZoneId.of("Europe/Berlin");

			ZonedDateTime _9AmInLA = ZonedDateTime.of(utcDateTime, zoneLA);
			ZonedDateTime _9AmInBerlin = ZonedDateTime.of(utcDateTime, zoneBerlin);

			// UTC-7.00 hours: _9AmInLA =
			// 2015-05-15T09:00-07:00[America/Los_Angeles]
			System.out.println("_9AmInLA = " + _9AmInLA);

			// UTC+2.00 hours: _9AmInBerlin =
			// 2015-05-15T09:00+02:00[Europe/Berlin]
			System.out.println("_9AmInBerlin = " + _9AmInBerlin);

			// if 9am in LA then UTC (9 am + 7 hours) = 2015-05-15T16:00:00Z
			System.out.println("if 9am in LA then UTC (9 am + 7 hours) = " + _9AmInLA.toInstant());

			// if 9am in Berlin then UTC (9 am - 2 hours) = 2015-05-15T07:00:00Z
			System.out.println("if 9am in Berlin then UTC (9 am - 2 hours) = " + _9AmInBerlin.toInstant());

			boolean laDaylightSavings = zoneLA.getRules().isDaylightSavings(_9AmInLA.toInstant());
			boolean berlinDaylightSavings = zoneBerlin.getRules().isDaylightSavings(_9AmInBerlin.toInstant());

			System.out.println("laDaylightSavings=" + laDaylightSavings); // true
			System.out.println("berlinDaylightSavings=" + berlinDaylightSavings); // true
		}

		LocalDateTime utcDateTime = LocalDateTime.of(2015, 05, 15, 9, 0);

		ZoneId zoneLA = ZoneId.of("America/Los_Angeles");
		ZoneId zoneBerlin = ZoneId.of("Europe/Berlin");

		ZonedDateTime _9AmInLA = ZonedDateTime.of(utcDateTime, zoneLA);

		// LA to berlin flying time 12 hours.
		ZonedDateTime arrivalTimeAsPerLA = _9AmInLA.plusHours(12);

		// arrivalTimeAsPerLA = 2015-05-15T21:00-07:00[America/Los_Angeles]
		System.out.println("arrivalTimeAsPerLA = " + arrivalTimeAsPerLA);

		ZonedDateTime arrivalTimeAtBerlin = arrivalTimeAsPerLA.withZoneSameInstant(zoneBerlin);

		// 9 HOURS time difference between LA and Berlin
		// arrivalTimeAtBerlin = 2015-05-16T06:00+02:00[Europe/Berlin]
		System.out.println("arrivalTimeAtBerlin = " + arrivalTimeAtBerlin);

	}

	private static void javaRegex() {
		AllRegex javaRegex = new AllRegex();
		javaRegex.regexExamples();

	}

	/**
	 * A direct byte buffer whose content is a memory-mapped region of a file.
	 * 
	 * @throws IOException
	 */
	private static void javaReadFileMostEfficently() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("c:/temp/purgeAccountStrProcedure.sql", "r");
		FileChannel inChannel = aFile.getChannel();
		MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());

		for (int i = 0; i < buffer.limit(); i++) {
			byte read = buffer.get();
			System.out.print((char) read);
		}
		inChannel.close();
		aFile.close();
	}

	/**
	 * This method shows the use of generics in java
	 */
	private static void javaGenerics() {
		List<String> test = new ArrayList<>();
		test.add("dd");
		testMethod(test);
		// This won't work as List<Object> is not compatiable to List<?>
		// testMethod2(test);
	}

	private static void testMethod(List<?> test) {
		System.out.println("reached here");
		System.out.println(test);
	}

	private static void testMethod2(List<Object> test) {
		System.out.println("reached here");
		System.out.println(test);
	}

	/**
	 * this method uncompresses the GZIP file
	 */
	private static void unCompressFromGZIP() {
		GZIPInputStream in = null;
		OutputStream out = null;
		try {

			in = new GZIPInputStream(new FileInputStream("C:\\temp\\1.PNG"));
			out = new FileOutputStream("C:\\temp\\1.PNG.gzip");

			byte[] buf = new byte[65536];
			int len;
			while ((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}

			in.close();
			out.close();
		} catch (IOException e) {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	/**
	 * This method modify string without creating new
	 */
	private static void modifyStringWithoutCreatingNew() {
		final String s = "Immutable String";
		System.out.println(s);
		final Class<String> type = String.class;
		try {
			final Field field = type.getDeclaredField("value");
			field.setAccessible(true);
			final char[] value = (char[]) field.get(s);
			value[0] = 'S';
			value[10] = 'I';
			System.out.println(String.valueOf(value));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method is created to get the words and their count from file and sort
	 * them by count.
	 */
	private static void findMaxRepeatedWordsSortedByCount() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		try {
			String fileName = "C:\\Harsh\\Personal\\Data\\Workspace8\\SampleJava8Prjt\\input.txt";
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					String tmp = st.nextToken().toLowerCase();
					if (wordMap.containsKey(tmp)) {
						wordMap.put(tmp, wordMap.get(tmp) + 1);
					} else {
						wordMap.put(tmp, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
		}
		System.out.println(wordMap);
		Set<Entry<String, Integer>> keySet = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(keySet);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		System.out.println(list);
	}

	private static void arrayCovariant() {
		Number[] number = new Number[3];
		number[0] = new Double("30.9");
		number[1] = new Integer(30);
		number[2] = new Byte("30");
		System.out.println(Arrays.toString(number));
		Integer[] intteger = new Integer[5];
		number = intteger;
		// Below will compile but will throw exception at runtime.
		// This means that we can fool the compiler, but we cannot fool the
		// run-time type system.
		// number[0] = 3.14;
		number[0] = 3;
		System.out.println(number[0].getClass());

		// Another Example of covariant which is not applicable to collection
		// object. i.e if method sum takes List<Number> and you call sum with
		// List<Integer>, List<Long>, List<Double> than an compile time error is
		// raised
		Integer[] myInts = { 1, 2, 3, 4, 5 };
		Long[] myLongs = { 1L, 2L, 3L, 4L, 5L };
		Double[] myDoubles = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		System.out.println(sum(myInts));
		System.out.println(sum(myLongs));
		System.out.println(sum(myDoubles));

		List<Integer> integer = new ArrayList<>();
		List<Double> doubleObject = new ArrayList<>();
		// below two calls can be called when argumenr of sumOfList is List<?
		// extends Number> and not List<Number>.
		sumOfList(integer);
		sumOfList(doubleObject);
	}

	static long sumOfList(List<? extends Number> numbers) {
		long summation = 0;
		for (Number number : numbers) {
			summation += number.longValue();
		}
		return summation;
	}

	static long sum(Number[] numbers) {
		long summation = 0;
		for (Number number : numbers) {
			summation += number.longValue();
		}
		return summation;
	}

	/**
	 * 
	 */
	private static void collectionCovariant() {
		List<Integer> myInts = new ArrayList<Integer>();
		myInts.add(1);
		myInts.add(2);
		// Compiler Error as List<Intger> cann't be assigned to List<Number>
		// List<Number> myNums = myInts; // compiler error
		List myInts1 = new ArrayList();
		// Compiler won't throw an exception
		List<Integer> myInteger = myInts1;
		List<Object> myObject = myInts1;
		List<Number> myNumber = myInts1;
		myNumber.add(13.44);
		System.out.println(myNumber);

		List<?> listUnknown = myInts1;
		List<?> listUnknown1 = myInts;

		List<? extends Number> myNums = new ArrayList<Integer>();
		List<? extends Number> myNums1 = new ArrayList<Float>();
		List<? extends Number> myNums2 = new ArrayList<Double>();
		// myNums2.add(10); this will give compile error as it is write
		// operation
		myNums2.add(null);
		Number number = myNums2.get(0); // this won't give any exception as it
										// is read operation
	}

	/**
	 * This method finds days between 2 dates i.e 20-Mar to 5-Apr
	 */
	private static int javaDaysBetween2Dates() {
		int workingDays = 0;
		Date startDate = new GregorianCalendar(2017, Calendar.MARCH, 17).getTime();
		Date endDate = new GregorianCalendar(2017, Calendar.APRIL, 5).getTime();

		Calendar calStartDate = Calendar.getInstance();
		calStartDate.setTime(startDate);
		Calendar calEndDate = Calendar.getInstance();
		calEndDate.setTime(endDate);

		if (calStartDate.getTimeInMillis() == calEndDate.getTimeInMillis()) {
			System.out.println("Dates are same");
			return workingDays;
		}
		while (calStartDate.getTime().compareTo(calEndDate.getTime()) < 0) {
			if (calStartDate.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& calStartDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				workingDays++;
			}
			calStartDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		return workingDays;
	}
}