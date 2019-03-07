package com.person.bootstater.services.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;


/**
 * Collections of Java languages
 *
 */
public class Main {

	public static void main(String[] args) {
		
		EnumMap emap = null;
		IdentityHashMap idHashMap = null;
		WeakHashMap<String, Integer> wHashMap = null;
		wHashMap.keySet();
		
		LinkedHashMap liHashMap = null;
		PriorityQueue pQueue = null;
		
		ArrayDeque arrDqueue = null;
		
		ArrayList arr = null;
		arr.size();
		
		Integer[] iarr = null;
		
		TreeSet tset = null;
		
		HashSet hSet = null;
		
		ConcurrentMap cMap = null;
		
		ConcurrentNavigableMap cnMap = null;
		
		TransferQueue tQueue = new LinkedTransferQueue<>();

		CopyOnWriteArrayList cowArrayList = null;
		
		DelayQueue delayQueue = null;
		
		SynchronousQueue sQueue = null;
		
		PriorityBlockingQueue pBQueue = null;

		CopyOnWriteArraySet cowArraySet =null;
		
		ConcurrentSkipListSet skipListSet = null;
				
	}

}
