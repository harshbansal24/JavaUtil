/**
 * 
 */
package com.harsh.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.harsh.util.helper.Address;
import com.harsh.util.helper.OptionalExampleForJava8;
import com.harsh.util.helper.Person;
import com.harsh.util.helper.PyramidExample;
import com.harsh.util.helper.commandForJava8.Command;
import com.harsh.util.helper.commandForJava8.CommandA;
import com.harsh.util.helper.commandForJava8.CommandB;

public class AllJava8Examples {

	/**
	 * 
	 */
	public AllJava8Examples() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// javaForLoopExamples();
		// javaSumALL();
		// javaAtomicConcurrency();
		// javaEnumMapExample();
		// javaCollectionFilterByPredicate();
		// javaOptionalExample();
		// javaEnum();
		// java8FistExample();
		// java8MapSorted();
		// java8Distinct();
		// java8ReturnCollection();
		// javaMultipleIfElseByEnum("ABC");
		// javaMultipleIfElseByClass();
		// javaThreadByLamba();
		// javaRemoveData();
		// javaSerializableFactory();
		// javaPyramidExample();
		// javaStringFactory();
		// javaCollectionFactory();
		// javaEnumFactory();
		// javaIOFactory();
		// java8CodeFactory();
		// javaOptional();
	}

	/**
	 * This method has Java serializable examples
	 */
	private static void javaSerializableFactory() {
		javaSerializableExample();
	}

	/**
	 * This is a method for Java Collection Examples
	 */
	private static void javaCollectionFactory() {
		javaRemoveData();
	}

	/**
	 * This is a method for Enum exmaples
	 */
	private static void javaEnumFactory() {
		javaMultipleIfElseByEnum("ABC");
		javaEnumFactory();
		javaEnumMapExample();
		javaEnum();
	}

	/**
	 * This method has methods for java 8 operations.
	 */
	private static void java8CodeFactory() {
		javastreamExamples();
		javaOptionalExample();
		javaSumALL();
		javaCollectionFilterByPredicate();
		java8FistExample();
		java8MapSorted();
		java8Distinct();
		java8ReturnCollection();
		javaForLoopExamples();
		javaMultipleIfElseByClass();
		javaThreadByLamba();
		javaAtomicConcurrency();
		javaOptional();
	}

	/**
	 * This method provides IO operation sample code
	 * 
	 * @throws IOException
	 */
	private static void javaIOFactory() {
		// readFile();
		javaFileFilterBasedOnExtension();
	}

	/**
	 * This method filter the files based on extension.
	 */
	private static void javaFileFilterBasedOnExtension() {
		File dir = new File("C:\\Harsh\\downloads\\chrome");
		File[] files = dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.getName().toLowerCase().endsWith("pdf")) {
					System.out.println(pathname);
					return true;
				} else {
					return false;
				}
			}
		});
	}

	/**
	 * This method has different methods to opreate on string.
	 */
	private static void javaStringFactory() {
		// javaReplaceWhiteSpacesInString();
		// javaFindDuplicateCharacterInString();
		javaArrayCompairForExquality();
	}

	/**
	 * This method copy the array
	 */
	private static void javaArrayCompairForExquality() {
		int[] arrayOne = { 2, 5, 1, 7, 4 };
		int[] arrayTwo = { 2, 5, 1, 7, 4 };
		int[] arrayThree = { 2, 5, 1, 7, 6 };
		Object[] arrayFour = { 2, 5, 1, 7, 6 };
		Object[] arrayFive = { 2, 5, 1, 7, 6 };
		Object[][] arraySix = { { 2, 5, 1, 7, 6 }, { 2, 5, 1, 7, 9 } };
		Object[][] arraySeven = { { 2, 5, 1, 7, 6 }, { 2, 5, 1, 7, 8 } };
		{
			boolean bFlag = true;
			for (int i = 0; i < arrayTwo.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					bFlag = false;
				}
			}
			if (!bFlag) {
				System.out.println("---NOT MATCHED---");
			} else {
				System.out.println("---MATCHED---");
			}
		}
		{
			System.out.println(Arrays.equals(arrayOne, arrayTwo));
			System.out.println(Arrays.equals(arrayTwo, arrayThree));
		}
		{
			System.out.println(Arrays.deepEquals(arrayFive, arrayFour));
			System.out.println(Arrays.deepEquals(arraySix, arraySeven));
		}
	}

	/**
	 * Finding a duplicate in String.
	 */
	private static void javaFindDuplicateCharacterInString() {
		String str = "JavaJ2ee10YrsExpStrutsSpringHibernate";
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			Character character = charArray[i];
			if (map.get(character) == null) {
				map.put(character, 1);
			} else {
				map.put(character, map.get(character) + 1);
			}
		}
		System.out.println(map);
	}

	private static void javaReplaceWhiteSpacesInString() {
		String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
		{
			// Using replaceALl method
			str = str.replaceAll(" ", "");
			System.out.println(str);
		}
		{
			// USing character aaray
			char[] charArray = str.toCharArray();
			StringBuilder sb = new StringBuilder();
			StringBuilder sb1 = new StringBuilder();
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] != ' ') {
					sb.append(charArray[i]);
				}
			}
			System.out.println(sb);
		}
		{
			// Using Character.isWhitespace
			char[] charArray = str.toCharArray();
			StringBuilder sb1 = new StringBuilder();
			for (int i = 0; i < charArray.length; i++) {
				if (!Character.isWhitespace(charArray[i])) {
					sb1.append(charArray[i]);
				}
			}
			System.out.println(sb1);
		}
	}

	/**
	 * Pyramid Example
	 */
	private static void javaPyramidExample() {
		PyramidExample.main(null);
	}

	private static void javaSerializableExample() {
		SeralizeObject allThreadJava = new SeralizeObject(1, "test1");

		try (FileOutputStream fs = new FileOutputStream("serialize.out");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			os.writeObject(allThreadJava);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
		System.out.println("---now reading---");

		try (FileInputStream fs = new FileInputStream("serialize.out");
				ObjectInputStream os = new ObjectInputStream(fs);) {
			SeralizeObject sr = (SeralizeObject) os.readObject();
			System.out.println("------" + sr.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("---now for not serailzable---");
		NotSeralize notSeralize = new NotSeralize(2, "not ");
		try (FileOutputStream fs = new FileOutputStream("notserialize.out");
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			os.writeObject(notSeralize);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---now reading---");

		try (FileInputStream fs = new FileInputStream("notserialize.out");
				ObjectInputStream os = new ObjectInputStream(fs);) {
			NotSeralize sr = (NotSeralize) os.readObject();
			System.out.println("------" + sr.toString());
			System.out.println("------" + ((SeralizeObject) sr).toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method is for stream examples.
	 */
	private static void javastreamExamples() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Hrithik");
		memberNames.add("Deepika");
		memberNames.add("Yana");
		memberNames.add("Harsh");
		memberNames.add("Aarav");
		{
			System.out.println("Simple Stream");
			Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
			stream.forEach(p -> System.out.println(p));
		}
		{
			System.out.println("Simple Stream with Integer array");
			Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5 });
			stream.forEach(p -> System.out.println(p));
		}
		{
			System.out.println("Simple Stream with Arraylist where sequence is not present");

			Stream<Integer> stream = list.parallelStream();
			stream.forEach(p -> System.out.println(p));
		}
		{
			System.out.println("Using collect method");
			Stream<Integer> stream = list.stream();
			List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
			System.out.println(list);
			System.out.println(collect);
		}
		{
			System.out.println("Use of Filter starts with A");
			memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
			System.out.println("Use of Filter starts with A and change the case");
			memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
			System.out.println("Use of Filter starts with H and change the case with Method call");
			memberNames.stream().filter((s) -> s.startsWith("H")).map(AllJava8Examples::convertToUpperCase)
					.forEach(System.out::println);
		}
		{
			System.out.println("Use of sorted Method");
			memberNames.stream().sorted().forEach(System.out::println);
		}
		{
			System.out.println("Use of match method for matching a value");
			boolean anyMatch = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
			System.out.println("Match for starting with A " + anyMatch);
			anyMatch = memberNames.stream().anyMatch((s) -> s.startsWith("D"));
			System.out.println("Match for starting with D " + anyMatch);
			anyMatch = memberNames.stream().allMatch((s) -> s.startsWith("A"));
			System.out.println("All Match for starting with A " + anyMatch);
			anyMatch = memberNames.stream().noneMatch((s) -> s.startsWith("B"));
			System.out.println("None Match for starting with B " + anyMatch);
		}
		{
			System.out.println("Use of count method");
			long count = memberNames.stream().filter((s) -> s.startsWith("A")).count();
			System.out.println("Number of elements starting with A " + count);
		}
		{
			System.out.println("use of 'toArray'");
			Stream<Integer> stream = list.stream();
			Integer[] array = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
			System.out.println(list);
			System.out.println(array.length);
		}
		{
			System.out.println("reduce method example");
			Optional<String> reduce = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
			reduce.ifPresent(System.out::println);
		}
		{
			System.out.println("findFirst Example");
			String string = memberNames.stream().filter((s) -> s.startsWith("H")).findFirst().get();
			System.out.println("Found  " + string);
		}
		{
			System.out.println("This will be indefinate stream as there is no stopage");
			Stream<Date> generate = Stream.generate(() -> {
				return new Date();
			});
			generate.forEach(p -> {
				int i = 0;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(p);
			});
		}

	}

	public static String convertToUpperCase(String str) {
		return str.toUpperCase();
	}

	private static void javaCollectionExample() {
		AllCollection.collectionIterate();

	}

	/**
	 * This method is for reading the file.
	 * 
	 * @throws IOException
	 */
	private static void readFile() throws IOException {
		Path file = Paths.get("c:/temp/purgeAccountStrProcedure.sql");
		Stream<String> lines = Files.lines(file);
		for (String line : (Iterable<String>) lines::iterator) {
			System.out.println(line);
		}
	}

	/**
	 * This method defines optional class usage.
	 */
	private static void javaOptional() {
		// First way for creating empty object
		{
			Optional<com.harsh.util.helper.Person> obj = Optional.empty();
			System.out.println(obj.toString());// Output = Optional.empty
		}
		// Second way, if it is null then NPE is thrown. This is a static
		// factory.
		{
			Person obj = new Person();
			Optional<Person> optional = Optional.of(obj);
			System.out.println(obj.toString());// com.java8.helper.Person@1db9742
		}
		// Third Way. Even if obj1 is null NPE is not thrown.
		// obj1 = null;
		{
			Person obj = new Person();
			Optional<Person> optional1 = Optional.ofNullable(obj);
			System.out.println(optional1.toString());// Optional[com.java8.helper.Person@1db9742]
		}
		// Use of Optional
		{
			Person obj = new Person();
			Optional<Person> optional1 = Optional.ofNullable(obj);
			optional1.ifPresent(System.out::println);// com.java8.helper.Person@1db9742
		}
		{
			Person obj = new Person();
			Optional<Address> address = obj.getAddress();
			address.ifPresent(System.out::println);// com.java8.helper.Address@3abc88
			// If address is present than print strAdd.
			if (address.isPresent()) {
				address.get().getStrAdd().toString();
			}
		}
		// filtering based on getStrAdd of Address class
		{
			Person obj = new Person();
			Optional<Address> address = obj.getAddress();
			// address.filter(address1 ->
			// "India".equals(address.get().getStrAdd())
			// .ifPresent(() -> System.out.println("you live in india")));
		}
		// use of Flat map which is used to reduce unsafe cascading.
		{
			Person person = new Person();
			Optional<Person> obj = Optional.ofNullable(person);
			// Since strAdd is Optional hence flatMap is used to get getStrAdd
			// otherwise we have to use map.
			String strAdd = obj.flatMap(Person::getAddress).flatMap(Address::getStrAdd).orElse("No Address");
			System.out.println(strAdd);
			String strCity = obj.flatMap(Person::getAddress).map(Address::getStrAdd)
					.orElse(Optional.ofNullable("No City")).toString();
			System.out.println(strCity);
		}

		// ANother difference between map and flatMap
		{
			List<String> loseWeight = new ArrayList<>();
			loseWeight.add("avocados");
			loseWeight.add("beans");
			loseWeight.add("salad");
			loseWeight.add("oats");
			loseWeight.add("broccoli");
			List<Integer> collect = loseWeight.stream().map(a -> a.length()).collect(Collectors.toList());
			System.out.println(collect); // [8, 5, 5, 4, 8]

			List<List> listOfListOfNumber = new ArrayList<>();
			listOfListOfNumber.add(Arrays.asList(2, 4));
			listOfListOfNumber.add(Arrays.asList(3, 9));
			listOfListOfNumber.add(Arrays.asList(4, 16));
			Object listOfIntegers = listOfListOfNumber.stream().flatMap(list -> list.stream())
					.collect(Collectors.toList());
			System.out.println(listOfIntegers);// [2, 4, 3, 9, 4, 16]
		}

		new OptionalExampleForJava8().main(null);
	}

	private static void javaRemoveData() {
		List<String> listOfPhones = new ArrayList<String>(
				Arrays.asList("iPhone 6S", "iPhone 6", "iPhone 5", "Samsung Galaxy 4", "Lumia Nokia"));
		Iterator<String> itr = listOfPhones.iterator();
		while (itr.hasNext()) {
			String strNextToken = itr.next();
			if (strNextToken.startsWith("iPhone")) {
				itr.remove();
			}
		}

		for (String string : listOfPhones) {
			System.out.println(string);
		}
	}

	/**
	 * This method is sample of lamba expression
	 */
	private static void javaThreadByLamba() {
		Thread t = new Thread() {
			public void run() {
				System.out.println("hi");
				System.out.println(this.getClass());
			}
		};
		t.start();

		// New way
		new Thread(() -> {
			System.out.println("By Lambda");
			System.out.println("Another system");
			// System.out.println(this);
		}).start();

		// Lambda for list object
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach((x) -> System.out.print(x + " "));

		System.out.println("by static method call");
		list.forEach(System.out::print);

		System.out.println("Print all numbers");
		evaluate(list, (n) -> true);

		System.out.println();
		System.out.println("Print none number");
		evaluate(list, (n) -> false);

		System.out.println();
		System.out.println("Even Numbers");
		evaluate(list, (n) -> n % 2 == 0);

		System.out.println();
		System.out.println("Odd Numbers");
		evaluate(list, (n) -> n % 2 != 0);

		System.out.println();
		System.out.println("Greater than 4");
		evaluate(list, (n) -> n > 4);

		System.out.println();
		System.out.println("Power of 2 for numbers");
		list.stream().map((x) -> x * x).forEach(System.out::println);

		System.out.println();
		System.out.println("all the numbers more than 2");
		list.stream().filter(x -> x > 2).forEach(System.out::println);

		int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
		System.out.println("Total sum is power of number " + sum);
	}

	private static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer integer : list) {
			if (predicate.test(integer)) {
				System.out.print(integer + " ");
			}
		}
		System.out.println();
		System.out.println("Using lambda expression");
		list.forEach((x) -> {
			if (predicate.test(x)) {
				System.out.print(x + " ");
			}
		});
	}

	/**
	 * removing multiple if and else using class
	 */
	private static void javaMultipleIfElseByClass() {
		Map<String, Command> map = new HashMap<>();
		map.put("A", new CommandA());
		map.put("B", new CommandB());
		map.get("B").exec();
		// In Java 8
		Map<String, Command> mapJava8 = new HashMap<>();
		mapJava8.put("A", () -> System.out.println("Object A"));
		mapJava8.put("B", () -> System.out.println("Object B"));
		mapJava8.get("B").exec();
	}

	/**
	 * Command Pattern for multiple if and else
	 * 
	 * @param string
	 */
	private static void javaMultipleIfElseByEnum(String string) {
		// ActionEnum.valueOf(string).doSomething();
	}

	private static void java8ReturnCollection() {
		List<Integer> lista = Arrays.asList(1, 2, 3, 1, 4, 5, 6, 3, 2, 1, 46, 7, 8, 9, 11);
		List<Integer> listaOddNumber = lista.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(listaOddNumber);
	}

	private static void java8Distinct() {
		List<Integer> lista = Arrays.asList(1, 2, 3, 1, 4, 5, 6, 3, 2, 1, 46, 7, 8, 9, 11);
		int icount = lista.size();
		System.out.println(icount);
		lista.stream().distinct().forEach(System.out::println);
	}

	private static void java8MapSorted() {
		List<String> lista = Arrays.asList("Robert", "Rahul", "Raj", "Rohit");
		lista.stream().filter(string -> string.startsWith("Ra")).map(String::toLowerCase).sorted()
				.forEach(System.out::println);
	}

	private static void java8FistExample() {
		List<Integer> lista = Arrays.asList(1, 2, 3, 46, 7, 8, 9, 11);
		int sum = 0;
		for (Integer integer : lista) {
			if (integer % 2 != 0) {
				sum += integer;
			}
		}
		System.out.println(sum);

		// using lamdba expression to get the sum of odd number
		sum = lista.stream().filter(number -> (number % 2 != 0)).reduce(0, Integer::sum);
		System.out.println(sum);

		// just getting the sum
		sum = lista.stream().reduce(0, Integer::sum);
		System.out.println(sum);

		// getting the sum of odd number by using method call.
		sum = lista.stream().filter(AllJava8Examples::testOdd).reduce(0, Integer::sum);
		System.out.println(sum);
	}

	static boolean testOdd(int number) {
		return number % 2 != 0;
	}

	private static void javaEnum() {
		Day day = Day.WEDNESDAY;
		if (day == Day.WEDNESDAY) {
			System.out.println("Wednesday");
		} else {
			System.out.println("Not Wednesday");
		}

		switch (day) {
		case MONDAY:
			System.out.println("Monday");
			break;

		default:
			System.out.println("Wednesday");
			System.out.println(day.getiDay());
			break;
		}
		for (Day iterable_element : Day.values()) {
			System.out.println(iterable_element.getiDay() + " " + iterable_element.toString());
		}

		day = Day.valueOf("TUESDAY");
		System.out.println(day);
	}

	private static void javaForLoopExamples() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Integer a = 0;
		System.out.println("Iteration by stream in Java for power");
		list.stream().map((x) -> Math.pow(x, 3.0d)).forEach(System.out::println);
		System.out.println("Iteration by stream in Java for variables");
		list.stream().map((x) -> x).forEach(System.out::println);
		System.out.println("Iteration for each with Consumer");
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("hi");
				a.sum(a, t);
				System.out.println(a);
			}

		});
		System.out.println(a);
		System.out.println("Iteration without stream");
		list.forEach((Integer ivalue) -> System.out.println(ivalue));
	}

	public enum STATE {
		NEW, RUNNING, WAITING, FINISHED;
	}

	/**
	 * This method is used for the optional checking of variable to avoid NPE
	 */
	private static void javaOptionalExample() {
		Integer value1 = null;
		Integer value2 = new Integer(10);

		// Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);

		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.hashCode());
		System.out.println(b.get());

		Optional<String> oString = Optional.ofNullable("Harsh");
		System.out.println(oString.get());
		System.out.println(oString.isPresent());
	}

	private static void javaCollectionFilterByPredicate() {

		List<String> list = new ArrayList<String>();
		list.add("How are you");
		list.add("How you doing");
		list.add("Joe");
		list.add("Mike");

		// Collection<String> filtered = Collections2.filter(list,
		// Predicates.containsPattern("How"));
		// System.out.println(filtered);
	}

	/**
	 * EnumMap Example
	 */
	private static void javaEnumMapExample() {

		EnumMap<STATE, String> stateMap = new EnumMap<STATE, String>(STATE.class);
		// Java EnumMap Example 2:putting values inside EnumMap in Java
		// we are inserting Enum keys on different order than their natural
		// order
		stateMap.put(STATE.RUNNING, "Program is running");
		stateMap.put(STATE.WAITING, "Program is waiting");
		stateMap.put(STATE.NEW, "Program has just created");
		stateMap.put(STATE.FINISHED, "Program has finished");

		// Java EnumMap Example 3:printing size of EnumMap in java
		System.out.println("Size of EnumMap in java: " + stateMap.size());

		// Java EnumMap Example 5:printing Java EnumMap , should print EnumMap
		// in natural order
		// of enum keys (order on which they are declared)
		System.out.println("EnumMap: " + stateMap);

		// Java EnumMap Example 5:retrieving value from EnumMap in java
		System.out.println("EnumMap key : " + STATE.NEW + " value: " + stateMap.get(STATE.NEW));

		// Java EnumMap Example 6:Iterating over Java EnumMap
		Iterator<STATE> enumKeySet = stateMap.keySet().iterator();
		while (enumKeySet.hasNext()) {
			STATE currentState = enumKeySet.next();
			System.out.println("key : " + currentState + " value : " + stateMap.get(currentState));
		}

		// Java EnumMap Example 7: checking if EnumMap contains a particular key
		System.out.println("Does stateMap has :" + STATE.NEW + " : " + stateMap.containsKey(STATE.NEW));

		// Java EnumMap Example 8: checking if EnumMap contains a particular
		// value
		System.out.println("Does stateMap has :" + STATE.NEW + " : " + stateMap.containsValue(null));

	}

	/**
	 * Sample code for atomicity for concurrency.
	 */
	private static void javaAtomicConcurrency() {
		AtomicInteger ai = new AtomicInteger(5);
		ai.addAndGet(12);
		System.out.println(ai);
		ai.getAndIncrement();
		System.out.println(ai);

		AtomicReference<Integer> air = new AtomicReference<Integer>(5);
		// * can be replaced by any operator
		BinaryOperator<Integer> accumulatorFunction = (i1, i2) -> i1 * i2;
		air.accumulateAndGet(18, accumulatorFunction);
		System.out.println(air);
	}

	private static void javaSumALL() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		Integer a = 0;
		numbers.stream().map((Integer x) -> x + a).forEach(System.out::println);

		System.out.println(a);
	}

}

enum Day {

	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int iDay;

	private Day(int iDay) {
		this.iDay = iDay;
	}

	public int getiDay() {
		return iDay;
	}

}

class SeralizeObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1635780786005810919L;
	int i = 10;
	String str = "Test";
	NotSeralize notSeralize;

	public SeralizeObject(int i, String str) {
		super();
		this.i = i;
		this.str = str;
		this.notSeralize = new NotSeralize(i, str);
	}

	public SeralizeObject() {
		super();
		this.i = 777777;
		this.str = "No arg testingffffffffffffffffffffffff";
	}

	@Override
	public String toString() {
		return "SeralizeObject [i=" + i + ", str=" + str + "Not Seralize " + this.notSeralize + "]";
	}

}

class NotSeralize extends SeralizeObject {
	int i = 10;
	String str = "Test";

	public NotSeralize(int i, String str) {
		this.i = i;
		this.str = str;
	}

	public NotSeralize() {
		super();
	}

	@Override
	public String toString() {
		return "NotSeralize [i=" + i + ", str=" + str + "Super class" + super.toString() + "]";
	}
}