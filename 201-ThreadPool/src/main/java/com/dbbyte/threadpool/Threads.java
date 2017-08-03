package com.dbbyte.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {

	public static void main(String[] args) {

		// initally will create 5 thread responsible to handle the requests passed to this executor
		ExecutorService executorService = Executors.newFixedThreadPool(5); 
		
		
		
		for (int i=0; i<10; i++){
			Runnable runnable = new MyRunnable("myWorkerThread:"+i);
			executorService.execute(runnable);
		}
		
		executorService.shutdown();
		
		while(!executorService.isTerminated()) {
			
		}
		System.out.println("All requests completed!");
		
	}

}
