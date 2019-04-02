package com.harsh.util.helper;

import java.util.Optional;

public class Address {
	private Optional<String> strAdd = Optional.empty();
	private String strCity;

	public Address(Optional<String> strAdd) {
		super();
		this.strAdd = strAdd;
	}

	public Optional<String> getStrAdd() {
		return strAdd;
	}

	public void setStrAdd(Optional<String> strAdd) {
		this.strAdd = strAdd;
	}

	public String getStrCity() {
		return strCity;
	}

	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}
	
	
}
