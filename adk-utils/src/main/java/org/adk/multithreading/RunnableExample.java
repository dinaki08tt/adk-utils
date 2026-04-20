package org.adk.multithreading;

public class RunnableExample implements Runnable {
	private String threadName;
	private Thread t;
	
	public RunnableExample(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		System.out.println(threadName + "started");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(threadName + " index ="+ i);
			try {
				Thread.sleep(60 * 60 * 5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println(threadName + "stop");
	}
	
	
	public void start() {
		t = new Thread(this, threadName);
		t.start();
	}
	

}
