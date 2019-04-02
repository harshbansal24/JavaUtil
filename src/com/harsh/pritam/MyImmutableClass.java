package com.harsh.pritam;

public class MyImmutableClass {
	private final String name;
	private final String mobile;

	public MyImmutableClass(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

}

// public final class ImmutableReminder{
// private final Date remindingDate;
//
// public ImmutableReminder (Date remindingDate) {
// if(remindingDate.getTime() < System.currentTimeMillis()){
// throw new IllegalArgumentException("Can not set reminder +
//  for past time: " + remindingDate);
// }
// this.remindingDate = new Date(remindingDate.getTime());
// }
//
// public Date getRemindingDate() {
// return (Date) remindingDate.clone();
// }
// }

// Read more:
// http://javarevisited.blogspot.com/2013/03/how-to-create-immutable-class-object-java-example-tutorial.html#ixzz313IxyqVf
