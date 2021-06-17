/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.vehicles.cars;
//Importing interfaces and class
import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;
//Class Car
public class Car extends Vehicle implements Movable,Runnable{
	
	//Start method
	@Override
	public void start()
	{
		System.out.println("Car Starts");
	}
	//Stop Method
	@Override
	public void stop()
	{
		System.out.println("Car Stops");
	}
	//Movable Method
	@Override
	public void move()
	{
		System.out.println("Car Moves");
	}
	//Runnable Method
	@Override
	public void run()
	{
		System.out.println("Car Runs");
	}

}
