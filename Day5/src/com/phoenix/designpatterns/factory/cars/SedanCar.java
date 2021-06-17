/*
 *Task : FactoryMethod
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.factory.cars;

//Class SedanCar
public class SedanCar extends Car{
    
	//Default Constructor
	public SedanCar()
	{
		System.out.println("SedanCar is Created");
	}
	//Start method
	@Override
	public void start()
	{
	    System.out.println("SedanCar Starts");	
	}
	//Stop method
	@Override
	public void stop()
	{
		System.out.println("SedanCar Stops");			
	}
	//Run method
	@Override
	public void run()
	{			
		System.out.println("SedanCar Runs");
	}
}
