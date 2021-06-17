/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.planets;
//Class Earth
public class Earth extends Planet{

	//Method SupportsLife
	@Override
	public boolean supportsLife() {
		// TODO Auto-generated method stub
		return true;
	}
	// Method Revolve
	@Override
	public void revolve()
	{
		System.out.println("Earth Revolves");
	}
	// Method Rotate
	@Override
	public void rotate()
	{
		System.out.println("Earth Rotates");
	}
	// Method Move
	@Override
	public void move()
	{
		System.out.println("Earth Moves");
	}
	
	
	

}
