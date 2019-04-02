package org.harsh.util;

public enum TestEnum {
	PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D"),DOCTOR("DR");

	private String statusCode;

	private TestEnum(String s) {
		statusCode = s;
	}

	public String getStatusCode() {
		return statusCode;
	}
}
