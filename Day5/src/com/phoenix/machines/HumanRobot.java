/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.machines;

//Importing Interface
import com.phoenix.interfaces.Walkable;
//Class Human Robot
public class HumanRobot extends Robot implements Walkable{

	//Walk Method
	@Override
	public void walk()
	{
		System.out.println("Human Robot Walks");
	}
	//ProceesData Method
	@Override
	public void processData()
	{
	 System.out.println("Human Robot Processes data");	
	}
	
	//senseInfo Method
	@Override
	public void senseInfo()
	{
		System.out.println("Human Robot senses info");
	}	
	//ProceesData Method
	@Override
	public	void useArtificialIntelligence()
	{
		System.out.println("Human Robot uses ArtificialIntelligence");
	}
}
