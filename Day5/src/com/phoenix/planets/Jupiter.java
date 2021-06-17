/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.planets;
//Class Earth
public class Jupiter extends Planet{
	
	    //Method SupportsLife
		@Override
		public boolean supportsLife() 
		{
			
			return false;
		}
		// Method Revolve
		@Override
		public void revolve()
		{
			System.out.println("Jupiter Revolves");
		}
		// Method Rotate
		@Override
		public void rotate()
		{
			System.out.println("Jupiter Rotates");
		}
		// Method Move
		@Override
		public void move()
		{
			System.out.println("Jupiter Moves");
		}
}
