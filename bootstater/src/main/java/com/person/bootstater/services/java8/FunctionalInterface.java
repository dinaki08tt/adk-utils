package com.person.bootstater.services.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {

	public static void main(String args[]) {
		//intOperation();
		stringOperation();
	}

	public static void intOperation() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Predicate<Integer> predicate = n -> true
		// n is passed as parameter to test method of Predicate interface
		// test method will always return true no matter what value n has.

		System.out.println("Print all numbers:");

		// pass n as parameter
		eval(list, n -> true);

		// Predicate<Integer> predicate1 = n -> n%2 == 0
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n%2 comes to be zero

		System.out.println("Print even numbers:");
		eval(list, n -> n % 2 == 0);

		// Predicate<Integer> predicate2 = n -> n > 3
		// n is passed as parameter to test method of Predicate interface
		// test method will return true if n is greater than 3.

		System.out.println("Print numbers greater than 3:");
		eval(list, n -> n > 3);
	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer n : list) {

			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}

	/**
	 * 
	 */
	public static void stringOperation() {
		List<String> list = Arrays.asList("kila", "bila", "sila", "eila","villla");
		evalString(list, n-> n.length() == 4);
		System.out.println("========= Has String =====");
		evalString(list, s-> hasString(s, "k"));
	}

	/**
	 * 
	 * @param list
	 * @param predicate
	 */
	public static void evalString(List<String> list, Predicate<String> predicate) {

		for (String n : list) {
			if (predicate.test(n)) {
				System.out.println(n + " kulal");
			}
		}
	}
	
	public static boolean hasString(String original, String s) {
		return original.contains(s);
	}

}
