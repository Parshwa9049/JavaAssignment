/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.living.pet;
//Importing Animal class & Walkable Interface
import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

//Class Cat
public class Cat extends Animal implements Walkable{

	   //Walk Method
		@Override
		public void walk()
		{
			System.out.println("Cat Walks");
		}
}
