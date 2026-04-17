package org.adk.collectiontutorials;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

	      // creating a TreeSet 
	      TreeSet<Integer> treeset = new TreeSet<>();

	      // adding in the tree set
	      treeset.add(12);
	      treeset.add(1);
	      treeset.add(4);
	      treeset.add(15);
	      treeset.add(20);
//	      Arrays.sort(treeset, Collections.reverseOrder());
//	      Collections.re
	      
	      
	      // displaying the Tree set data
	      System.out.println("Tree set : " + treeset);
	      System.out.println("Reverse Order");
	      treeset.descendingIterator().forEachRemaining(p -> System.out.println(p));
	      System.out.println();
	      
	      System.out.println("Ceiling: "+treeset.ceiling(14));
	      System.out.println("Floor:" + treeset.floor(5));
	      System.out.println("First: " + treeset.first());
	      System.out.println("Last: "+ treeset.last());
	      System.out.println("Contains: "+ treeset.contains(6));
	      System.out.println("Contains: "+ treeset.contains(15));
	      System.out.println("HeadSet: "+ treeset.headSet(10));
	      System.out.println("tailset:"+ treeset.tailSet(10));
	      System.out.println("SubSet:"+ treeset.subSet(3, 19));
	      
	      System.out.println("PollFirst: "+ treeset.pollFirst());
	      System.out.println("PollFirst: "+ treeset.pollFirst());
	      System.out.println("PollFirst: "+ treeset.pollFirst());
	      System.out.println("PollFirst: "+ treeset.pollFirst());
	      
	      
	      
	   }   
}
