/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.planets;
//Importing Interfaces
import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

//Class Planet
public abstract class Planet implements Movable,Rotatable,Revolvable{
    //Declaring variable
	private int noOfMoons;
	
	//Non-AbstractMethod
	//SetMethod
	public void setMoons(int noOfMoons)
	{
		this.noOfMoons=noOfMoons;
	}
	//GetMethod
	public int getMoons()
	{
		return noOfMoons;
	}
	//Abstract method 
	protected abstract boolean supportsLife();
	
	//ToString Method
	@Override
	public String toString()
	{
		return "No of Moons : " + noOfMoons; 
	}
	@Override
	//Revolve Method
	public void revolve()
	{
		
	}
	@Override
	//Rotate Method
	public void rotate()
	{
		
	}
	@Override
	//Move Method
	public void move()
	{
		
	}
}
