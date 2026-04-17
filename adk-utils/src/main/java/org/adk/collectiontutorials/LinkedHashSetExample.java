package org.adk.collectiontutorials;

import java.util.LinkedHashSet;
import java.util.Spliterator;

/**
 *  to allow insertion-order iterations
 *  
 * @author dineshkrishnan.a
 *
 */
public class LinkedHashSetExample {

	 public static void main(String args[]) {
	      
	      // create hash set
	      LinkedHashSet <Integer> newset = new LinkedHashSet <>();      

	      // populate hash set
	      newset.add(10); 
	      newset.add(12);
	      newset.add(1); 
	      newset.add(2);
	      newset.add(30);
	      newset.add(300);
	      
	      newset.removeIf(f -> f>20);

	      // create an spliterator
	      Spliterator<Integer> spliterator = newset.spliterator(); 

	      // check values
	      spliterator.forEachRemaining(v -> System.out.println(v));
	   } 
}
