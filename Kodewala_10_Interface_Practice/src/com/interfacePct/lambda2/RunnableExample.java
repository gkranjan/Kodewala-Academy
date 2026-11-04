package com.interfacePct.lambda2;

public class RunnableExample {
	
	public static void main(String[] args) {
		// Implementing Runnable using an Anonymous Inner Class
		
		Runnable task = new Runnable()
				{
			@Override
			public void run()
			{
				System.out.println("Thread is running...");
			}
				};
				
				// Creating and starting the thread
				
				Thread thread = new Thread(task);
				thread.start();
	}

}
