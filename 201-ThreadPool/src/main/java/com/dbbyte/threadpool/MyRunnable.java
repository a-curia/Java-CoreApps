package com.dbbyte.threadpool;


/**
 * Create Thread Pool - this is the Worker
 * @author adrian.curia
 */
public class MyRunnable implements Runnable {
	
	private String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("Starting Thread ->" + name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending Thread ->" + name);
		
	}

}
