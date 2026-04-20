package org.adk.multithreading;

public class MainUtils {

	public static void main(String[] args) {
//		 RunnableDemo R1 = new RunnableDemo( "Thread-1");
//	      R1.start();
//	      
//	      RunnableDemo R2 = new RunnableDemo( "Thread-2");
//	      R2.start();
		
		RunnableExample r1 = new RunnableExample("T1");
		r1.start();
		
		RunnableExample r2 = new RunnableExample("T2");
		r2.start();
		
		RunnableExample r3 = new RunnableExample("T3");
		r3.start();
		
		
		
	}

}
