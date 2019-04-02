package com.designPattern.copyConstructor;

public class CopyConstructoreSample {

	private int id;
	private String strName;

	public CopyConstructoreSample(int id, String strName) {
		this.id = id;
		this.strName = strName;
	}

	CopyConstructoreSample(CopyConstructoreSample copyConstructoreSample) {
		this.id = copyConstructoreSample.getId();
		this.strName = copyConstructoreSample.getStrName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public static void main(String args[]) {
		CopyConstructoreSample constructoreSample = new CopyConstructoreSample(1, "harsh");
		CopyConstructoreSample constructoreSample1 = new CopyConstructoreSample(constructoreSample);
		constructoreSample.setId(3);
		System.out.println(constructoreSample1.getId());
	}
}
