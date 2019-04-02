/**
 * 
 */
package org.harsh.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClassJava8 {
	public String str = "harsh";
	public String str1 = "harsh";
	public String str2 = "harsh";
	public String str3 = "harsh";
	public String str4 = "harsh";
	public String str5 = "harsh";
	public String str6 = "harsh";

	/**
	 * 
	 */
	public TestClassJava8() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] asset = { "equity", "stocks", "gold", "foreign exchange", "fixed income", "futures", "options" };
		// List assetList = Arrays.asList(asset);
		List assetList = new ArrayList<>();

		Collections.addAll(assetList, asset);
		System.out.println(assetList);
		for (Object object : asset) {
			System.out.println(object);
		}
		assetList.set(0, "harsh");
		System.out.println(assetList);
		for (Object object : asset) {
			System.out.println(object);
		}

		ArrayList newAssetList = new ArrayList<>();
		newAssetList.addAll(Arrays.asList(asset));
		System.out.println(newAssetList);
		newAssetList.add("dddd");
		System.out.println(newAssetList);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		result = prime * result + ((str1 == null) ? 0 : str1.hashCode());
		result = prime * result + ((str2 == null) ? 0 : str2.hashCode());
		result = prime * result + ((str3 == null) ? 0 : str3.hashCode());
		result = prime * result + ((str4 == null) ? 0 : str4.hashCode());
		result = prime * result + ((str5 == null) ? 0 : str5.hashCode());
		result = prime * result + ((str6 == null) ? 0 : str6.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestClassJava8 other = (TestClassJava8) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		if (str1 == null) {
			if (other.str1 != null)
				return false;
		} else if (!str1.equals(other.str1))
			return false;
		if (str2 == null) {
			if (other.str2 != null)
				return false;
		} else if (!str2.equals(other.str2))
			return false;
		if (str3 == null) {
			if (other.str3 != null)
				return false;
		} else if (!str3.equals(other.str3))
			return false;
		if (str4 == null) {
			if (other.str4 != null)
				return false;
		} else if (!str4.equals(other.str4))
			return false;
		if (str5 == null) {
			if (other.str5 != null)
				return false;
		} else if (!str5.equals(other.str5))
			return false;
		if (str6 == null) {
			if (other.str6 != null)
				return false;
		} else if (!str6.equals(other.str6))
			return false;
		return true;
	}

	

}