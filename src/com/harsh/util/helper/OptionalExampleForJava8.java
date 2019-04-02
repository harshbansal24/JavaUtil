package com.harsh.util.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExampleForJava8 {

	public static void main(String[] args) {
		AddressInPerson address = new AddressInPerson("Lane 1", "Pune", "India", 411013);
		PersonWithAddress aarav = new PersonWithAddress("Aarav", Optional.ofNullable(address), 8989);
		PersonWithAddress harsh = new PersonWithAddress("Harsh", Optional.empty(), 8989);
		PersonWithAddress leena = new PersonWithAddress("Leena", Optional.empty(), 8989);
		List<PersonWithAddress> person = new ArrayList<>();
		person.add(aarav);
		person.add(harsh);
		person.add(leena);
		// setting default value in case address is not present.
		person.stream().forEach((p) -> {
			System.out.printf("Name %s from City %s", p.name(), p.address().orElse(AddressInPerson.EMPTY_ADDRESS));
			System.out.println();
		});

		// throwing an exception in case value is not present.
		person.stream().forEach((p) -> {
			System.out.printf("Name %s from City %s", p.name(),
					p.address().orElseThrow(() -> new ArrayIndexOutOfBoundsException()));
			System.out.println();
		});

	}
}

class PersonWithAddress {
	private String name;
	private Optional<AddressInPerson> address;
	private int phone;

	public PersonWithAddress(String name, Optional<AddressInPerson> address, int phone) {
		if (name == null) {
			throw new IllegalArgumentException("Null value for name is not permitted");
		}
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String name() {
		return name;
	}

	public Optional<AddressInPerson> address() {
		return address;
	}

	public int phone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + '}';
	}
}

class AddressInPerson {
	public static final AddressInPerson EMPTY_ADDRESS = new AddressInPerson("", "Bhopal", "", 0);
	private final String line1;
	private final String city;
	private final String country;
	private final int zipcode;

	public AddressInPerson(String line1, String city, String country, int zipcode) {
		this.line1 = line1;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String line1() {
		return line1;
	}

	public String city() {
		return city;
	}

	public String country() {
		return country;
	}

	public int zipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "Address{" + "line1=" + line1 + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + '}';
	}
}
