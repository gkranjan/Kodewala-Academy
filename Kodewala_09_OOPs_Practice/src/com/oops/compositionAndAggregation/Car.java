package com.oops.compositionAndAggregation;

public class Car {
	private Engine engine = new Engine();
	void start()
	{
		engine.start();
		System.out.println("Car started");
	}

}
