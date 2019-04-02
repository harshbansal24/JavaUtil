/**
 * 
 */
package org.harsh.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * @author C5190459
 *
 */
public class SimpleJava8Examples {

	/**
	 * 
	 */
	public SimpleJava8Examples() {
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
		javaOptionalExample();
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

}
