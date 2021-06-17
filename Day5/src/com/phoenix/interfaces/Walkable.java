/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.interfaces;
//Interface Walkable
public interface Walkable extends Jumpable,Runnable{

	//Methgod walk()
	default void walk()
	{
		System.out.println("Walkable Interface");
	}
}
