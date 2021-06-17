/*
 *Task : Singleton
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.singleton;
//Class SingletonMain
public class SingletonMain {
    //MainMethod
	public static void main(String[] args) {
		
		//Sun
		System.out.println("Sun");
		Sun ob= Sun.getInstance();
		ob.giveLight();
		Sun ob1 = Sun.getInstance();
		System.out.println("");
		//Earth
		System.out.println("Earth");
		Earth e1 = Earth.getInstance();
		e1.createLife();
		Earth e2 = Earth.getInstance();
		System.out.println("");
		//PrimeMinister
		System.out.println("PrimeMinister");
	    PrimeMinister p1 = PrimeMinister.getInstance();
	    p1.serveNation();
	    PrimeMinister p2 = PrimeMinister.getInstance();
	    System.out.println("");System.out.println("");
	    //President
	  	System.out.println("President");
	  	President pr1= President.getInstance();
	  	pr1.representNation();
	  	President pr2= President.getInstance();
	}

}
