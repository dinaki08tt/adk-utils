package org.adk.collectiontutorials;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer> fifoDeque = new ArrayDeque<>();

		// Add elements to the tail (Enqueue)
		fifoDeque.addLast(10);
		fifoDeque.addLast(20);

		// Add elements to the head (Enqueue)
		fifoDeque.addFirst(1);
		fifoDeque.addFirst(2);

		fifoDeque.forEach(System.out::println);
		
		// Remove elements from the head (Dequeue)
		System.out.println(fifoDeque.pollFirst()); // Output: First
		System.out.println(fifoDeque.pollLast()); // Output: Second
		System.out.println("Print elements");
		fifoDeque.forEach(System.out::println);
	}
}
