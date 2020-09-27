package com.person.bootstater.services.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ResolvedProblem {

	public static void main(String[] args) {

	System.out.println("Integer.MAX_VALUE:"+Integer.MAX_VALUE);
	System.out.println("Integer.MIN_VALUE:"+Integer.MIN_VALUE);
		
	//findBignSmall();
	//sortArrayList();
	//regexMatches();
	//countChars();
	//cntChars();
	isPalindromeString();
	isPalindrome(); //using SringBuilder
	
//	fibonacciSeries();
//	evenNumberSeries();
//	oddNumberSeries();
//	isNotInString();
	
//	countOccurance();
	//countOccuranceRegx();
	}

	public static void findBignSmall() {
		SortedSet<Long> bigNos = new TreeSet<>(); //stores value in ascending order
		bigNos.add(98796L);
		bigNos.add(897620362342L);
		bigNos.add(265L);

		System.out.println("Biggest No: "+bigNos.last());
		System.out.println("Smallest No: "+ bigNos.first());
		
	}

	public static void sortArrayList() {
		
		Integer[] arrInt = new Integer[] {3,67,43,1,23};
	
		List<Integer> intbucket = new ArrayList<>();
				
		intbucket.add(90);
		intbucket.add(50);
		intbucket.add(70);
		intbucket.add(900);
		intbucket.add(670);
	
		intbucket.addAll(Arrays.asList(arrInt));
		
		Collections.sort(intbucket); //sorts in ascending order
		System.out.println("Print in Ascending order *****");
		System.out.println(intbucket);
		
		Collections.reverse(intbucket); //arrange in descending order
		System.out.println("Print in descending order *****");
		System.out.println(intbucket);
		
		
		Collections.swap(intbucket, 0, intbucket.size()-1);
		System.out.println("Print in after Swapping *****");
		System.out.println(intbucket);
		
		Collections.swap(intbucket, 1, intbucket.size()-2);
	
		System.out.println("Print in after Swapping *****");
		System.out.println(intbucket);
	}
	
//	^ : start of string
//	[ : beginning of character group
//	a-z : any lowercase letter
//	A-Z : any uppercase letter
//	0-9 : any digit
//	_ : underscore
//	] : end of character group
//	* : zero or more of the given characters
//	$ : end of string
	
	
	public static void validateString() {
		String units = "emploooyeeA";
		System.out.println(units.matches("^[a-zA-Z]*$"));
	}

	/**
	 * Using Regex
	 * 
	 */
	public static void regexMatches() {
		 // String to be scanned to find the pattern.
	      String line = "RemplooooyeeA";
	      String pattern = "[^e]*e";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      
	      int cnt = 0;  
	      while (m.find()) {
	    	  cnt++;
	      }
	  
	      System.out.println("occurance of e: "+cnt);
	      
	      line = "empaaaloaayeeaa";
	      pattern = "[^a]*a";
	      r = Pattern.compile(pattern);
	      m = r.matcher(line);
	      
	      cnt = 0;  
	      while (m.find()) {
	    	  cnt++;
	      }
	  
	      System.out.println("occurance of a: "+cnt);
	      
	      
	}
	
	/**
	 * using JDK 8
	 */
	public static void countChars() {
		String someString = "emplooooyeeA";
		long count = someString.chars().filter(ch -> ch == 'e').count();
		System.out.println("occurance: "+count);
	}
	
	/**
	 * 
	 */
	public static void cntChars() {
		String someString = "emplooooyeeE";
		char someChar = 'e';
		int cnt = 0;
		  
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        cnt++;
		    }
		}
		
		System.out.println("Occurance: "+ cnt);
		
	}
	
	public static void isPalindromeString() {
//		redivider, deified, civic, radar, level, rotor, kayak, reviver, racecar, redder, madam, and refer.	
		String str, rev = "";
		str = "racecar";
		str = "\u0BB5\u0BBF\u0B95\u0B9F\u0B95\u0BB5\u0BBF";
		
		System.out.println(str);
//		Scanner to get string inputs from CommandLine
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter a string:");
//	    str = sc.nextLine();

		  int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev += str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	}
	
	/**
	 * using StringBuilder
	 * @return
	 */
	public static void isPalindrome(){
		String str = "radar";
		str = "\u0BB5\u0BBF\u0B95\u0B9F\u0B95\u0BB5\u0BBF";
		StringBuffer sbf = new StringBuffer(str);
		StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();
	    sbf.reverse();
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	    	System.out.println(str+" is a palindrome");
	    }else{  
	    	System.out.println(str+" is not a palindrome");  
	    }  
	    
	    rev = sbf.toString();
	    
	    if(str.equals(rev)){  
	    	System.out.println(str+" is a palindrome");
	    }else{  
	    	System.out.println(str+" is not a palindrome");  
	    }  
	    
	}  
	
	
	/**
	 * 
	 * fibonacciSeries using jdk8
	 * 
	 */
	public static void fibonacciSeries() {
		System.out.println("Fibonacci Series");
		Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
		.limit(15)
		.map(t -> t[0])
		.forEach(x -> System.out.println(x));
		
	}

	/**
	 * 
	 * using evenNumber series
	 * 
	 */
	public static void evenNumberSeries() {
		System.out.println("Even Number Series");
		Stream.iterate(new int[]{0}, t -> new int[]{t[0] + 2})
		.limit(15) // no .of iterations
		.map(t -> t[0])
		.filter(f -> f < 20)  // control limit to print
		.forEach(x -> System.out.println(x));
		
	}

	/**
	 * 
	 * using odd number series
	 * 
	 */
	public static void oddNumberSeries() {
		System.out.println("Odd Number Series");
		Stream.iterate(new int[]{1}, t -> new int[]{t[0] + 2})
		.limit(15) // no .of iterations
		.map(t -> t[0])
		.filter(f -> f < 50)  // control limit to print
		.forEach(x -> System.out.println(x));
	}
	
	
	public static void isNotInString() {
		
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
		String input  = "It is a Apple and not a Banana";
		//input ="I am Brutally honest";
		System.out.println("Sample Input");
		System.out.println(input);
		int in = input.indexOf("is");
		int inNot = input.indexOf("not");
		if(in!=-1 && inNot != -1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public static void countOccurance() {
		String str = "It is a fruit and notnot a vegetable";
		String findStr = "not";
		int lastIndex = 0;
		int count = 0;
		while (lastIndex != -1) {

		    lastIndex = str.indexOf(findStr, lastIndex);

		    if (lastIndex != -1) {
		        count++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println(count);
	}
	
	public static void countOccuranceRegx() {
		String str = "It is a fruit and notnot a vegetable";
		Pattern p = Pattern.compile("not");
		Matcher m = p.matcher(str);
		int count = 0;
		while (m.find()){
		    count++;
		}
		System.out.println(count);
	}
	
}