package org.harsh.util;

import java.io.Serializable;
import java.util.List;

public class ClassA implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2985398506413449158L;
	public String str1;
	public List lista;
	public Long longA;
	public ClassB classB;
	public List<ClassB> listClassB;

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public List getLista() {
		return lista;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

	public Long getLongA() {
		return longA;
	}

	public void setLongA(Long longA) {
		this.longA = longA;
	}

	public ClassB getClassB() {
		return classB;
	}

	public void setClassB(ClassB classB) {
		this.classB = classB;
	}

	public List<ClassB> getListClassB() {
		return listClassB;
	}

	public void setListClassB(List<ClassB> listClassB) {
		this.listClassB = listClassB;
	}

}
