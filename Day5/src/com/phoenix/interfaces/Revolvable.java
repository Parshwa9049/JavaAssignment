/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.interfaces;
//Interface Revolvable
public interface Revolvable {

	//Method revolve()
	default void revolve()
	{
		System.out.println("Revolvable Interface");
	}
}
