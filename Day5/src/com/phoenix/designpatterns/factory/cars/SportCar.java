
/*
 *Task : FactoryMethod
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.factory.cars;
//Class Sport Car
public class SportCar extends Car{
    //Default Constructor
	public SportCar()
	{
		System.out.println("SportCar is Created");
	}
	//Start method
	@Override
	public void start()
	{
	    System.out.println("SportCar Starts");	
	}
	//Stop method
	@Override
	public void stop()
	{
		System.out.println("SportCar Stops");			
	}
	//Run method
	@Override
	public void run()
	{			
		System.out.println("SportCar Runs");
	}
}
