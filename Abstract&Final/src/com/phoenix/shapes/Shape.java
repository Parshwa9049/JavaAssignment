/*
 *Task : Abstract class & final
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 13th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.shapes;

//Abstract class Shape
public abstract class Shape {
	//Declaring and Initializing Math_PI 
	public static final double Math_PI=3.14;
	
	//CalculateArea Method
	public abstract void calculateArea();
	//CalculatePerimeter Method
	public abstract void calculatePerimeter();

}
