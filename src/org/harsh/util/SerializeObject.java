package org.harsh.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;

public class SerializeObject {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassA classA1 = generateClassA1();
		ClassA classA2 = generateClassA2();

		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
					"yyyyMMDD_HHMMSS");
			Date date = new Date();
			String strFileNm = "C:\\Temp" + File.separator
					+ simpleDateFormat.format(date) + ".ser";
			System.out.println("File Name is "+strFileNm);
			FileOutputStream fileOut = new FileOutputStream(strFileNm);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(classA1);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	private static ClassA generateClassA2() {
		ClassA classA = new ClassA();
		classA.setStr1("ABC");
		classA.setLongA(10L);
		ClassB classB = new ClassB();
		{
			classB.setStr1("BCV");
			classB.setLongA(20L);
			List lista = new ArrayList();
			lista.add("123");
			classB.setLista(lista);
		}
		classA.setClassB(classB);
		List lista = new ArrayList();
		lista.add("hhgjfd");
		classA.setLista(lista);
		List<ClassB> listClassB = new ArrayList();
		listClassB.add(classB);
		classA.setListClassB(listClassB);
		return classA;
	}

	private static ClassA generateClassA1() {
		ClassA classA = new ClassA();
		classA.setStr1("ABC");
		classA.setLongA(10L);
		return classA;
	}

}
