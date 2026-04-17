package org.adk.collectiontutorials;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        
        // LinkedList specific methods (Deque interface)
        numbers.addFirst(5);  // Efficient O(1)
        numbers.addLast(30);
        
        System.out.println(numbers);
        
        // Accessing first and last
        int first = numbers.getFirst(); // 5
        
        // Removing elements (Fast if at ends: O(1))
        numbers.removeFirst(); 

        System.out.println(numbers); // Output: [10, 20, 30]
    }
}
