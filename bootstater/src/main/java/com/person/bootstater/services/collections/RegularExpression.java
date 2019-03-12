package com.person.bootstater.services.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		String str = "It is a fruit and notnot a vegetable";
		Pattern p = Pattern.compile(Pattern.quote("not"));
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()){
		    count++;
		}
		System.out.println(count);

		System.out.println(Pattern.quote("not"));
		
	}

}