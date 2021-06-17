/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.interfaces;
//Interface Runnable
public interface Runnable {
	//Method Run()
	default void run()
	{
		System.out.println("Runnable Interface");
	}

}
