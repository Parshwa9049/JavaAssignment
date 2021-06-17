/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.interfaces;
//Interface Rotatable
public interface Rotatable {

	//Method rotate()
	default void rotate()
	{
		System.out.println("Rotatable Interface");
	}
}
