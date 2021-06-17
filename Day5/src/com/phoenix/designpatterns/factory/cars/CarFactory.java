/*
 *Task : FactoryMethod
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.factory.cars;
//Class CarFactory
public class CarFactory {

	//Factory method
	public static Car newCar(String carType)
	{
		if(carType.equals("Sedan"))
		{
			return new SedanCar();
		}
		else if(carType.equals("Couple"))
		{
			return new CoupleCar();
		}
		else if(carType.equals("Sport"))
		{
			return new SportCar();
		}
		else if(carType.equals("Luxury"))
		{
			return new LuxuryCar();
		}
		else
		{
			return null;	
		}
	}
}
