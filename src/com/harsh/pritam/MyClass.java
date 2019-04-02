package com.harsh.pritam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClass extends MyThreadTest {

	private final String importantField;
	private final String anotherField;
	MyThreadTest xyz = new MyThreadTest();

	// xyz.
	public MyClass(final String equalField, final String anotherField) {
		this.importantField = equalField;
		this.anotherField = anotherField;
		this.sal = 10;
	}

	public String getEqualField() {
		return importantField;
	}

	public String getAnotherField() {
		return anotherField;
	}

	@Override
	public int hashCode() {
		System.out.println("---hascode called---");
		final int prime = 31;
		int result = 1;

		result = prime * result + ((importantField == null) ? 0 : importantField.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		System.out.println("---equal called---");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final MyClass other = (MyClass) obj;
		if (importantField == null) {
			if (other.importantField != null)
				return false;
		} else if (!importantField.equals(other.importantField))
			return false;
		return true;
	}

	public static void main(String[] args) {
		MyClass first = new MyClass("a", "first");
		MyClass second = new MyClass("a", "first");

		Map something = new HashMap();

		something.put(first, "xyz");
		System.out.println("hashcode of first " + first.hashCode());
		System.out.println("hashcode of second " + second.hashCode());
		something.put(second, "abc");
		Singleton singleton = null;
		singleton.getInstance().show();

		System.out.println("First is equal to second  " + first.equals(second));
		System.out.println("Map Size  " + something.size());

		int temp = first.sal + 1;
		List<String> list = new ArrayList<String>();
		// list.add (new Object());
		list.add((String) new Object()); // runtime error
	}

}
