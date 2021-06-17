/*
 *Task : FactoryMethod
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.factory.main;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CarFactory;

//Class Factorymain
public class FactoryMain {
   //MainMethod
	public static void main(String[] args) {
	
		String charType=args[0];
		//Invoking Factory Method
		Car car=CarFactory.newCar(charType);
		car.start();
		car.run();
		car.stop();

	}

}
