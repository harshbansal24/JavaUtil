package org.harsh.util;

import java.io.Serializable;
import java.util.List;

public class ClassB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5694259624829110931L;
	public String str1;
	public List lista;
	public Long longA;
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

}
