/*
 *Task : FactoryMethod
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.factory.cars;
//Class LuxuryCar
public class LuxuryCar extends Car{
    //Default Constructor
	public LuxuryCar()
	{
		System.out.println("LuxuryCar is Created");
	}
	//Start method
	@Override
	public void start()
	{
	    System.out.println("LuxuryCar Starts");	
	}
	//Stop method
	@Override
	public void stop()
	{
		System.out.println("LuxuryCar Stops");			
	}
	//Run method
	@Override
	public void run()
	{			
		System.out.println("LuxuryCar Runs");
	}
}
