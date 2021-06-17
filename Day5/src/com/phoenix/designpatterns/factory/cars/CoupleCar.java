/*
 *Task : FactoryMethod
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.factory.cars;
//Class CoupleCar
public class CoupleCar extends Car{
    //Default Constructor
	public CoupleCar()
	{
		System.out.println("CoupleCar is Created");
	}
	//Start method
	@Override
	public void start()
	{
	    System.out.println("CoupleCar Starts");	
	}
	//Stop method
	@Override
	public void stop()
	{
		System.out.println("CoupleCar Stops");			
	}
	//Run method
	@Override
	public void run()
	{			
		System.out.println("CoupleCar Runs");
	}
}
