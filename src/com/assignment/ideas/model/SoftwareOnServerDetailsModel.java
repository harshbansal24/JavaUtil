package com.assignment.ideas.model;

public class SoftwareOnServerDetailsModel {

	@Override
	public String toString() {
		return "[strServer=" + strServer + ", iVersion=" + iVersion + "]";
	}

	public SoftwareOnServerDetailsModel(String strServer, double iVersion) {
		super();
		this.strServer = strServer;
		this.iVersion = iVersion;
	}

	private String strServer;
	private double iVersion;
	public String strValue;

	public String getStrServer() {
		return strServer;
	}

	public void setStrServer(String strServer) {
		this.strServer = strServer;
	}

	public double getiVersion() {
		return iVersion;
	}

	public void setiVersion(double iVersion) {
		this.iVersion = iVersion;
	}

}
