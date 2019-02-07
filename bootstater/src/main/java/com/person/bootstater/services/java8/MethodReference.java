package com.person.bootstater.services.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List names = new ArrayList();
	      names.add("kila");
	      names.add("pila");
	      names.add("sila");
	      names.add("mila");
	      names.add("nila");
			
	      names.forEach(MethodReference::display);
	}

	/**
	 * 
	 * @param s
	 */
	public static void display(Object s) {
		String append = s+" kulal";
		System.out.println(append);
	}
}
