/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */

package com.phoenix.interfaces;
// Interface Movable
public interface Movable {
	//Method move()
	default void move()
	{
		System.out.println("Movable Interfaces");
	}

}
