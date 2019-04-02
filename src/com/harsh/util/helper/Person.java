package com.harsh.util.helper;

import java.util.Optional;

public class Person {

	private String strname;
	private Optional<Address> address =Optional.empty();

	public String getStrname() {
		return strname;
	}

	public void setStrname(String strname) {
		this.strname = strname;
	}

	public Optional<Address> getAddress() {
		return address;
	}

	public void setAddress(Optional<Address> address) {
		this.address = address;
	}

}
