/*
 *Task : Abstract class & final
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 13th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.shapes.rectangles;
//Importing Shape
import com.phoenix.shapes.Shape;

//Class Rectangle
public class Rectangle extends Shape {
	//Declaring & Initializing variables
	private int length;
	private int breadth;
	//Default Constructor
	public Rectangle()
	{
		length=3;
		breadth=4;
	}
	//Parametrized Constructor
	public Rectangle(int length , int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	//CalculateArea Method
	public void calculateArea()
	{
		System.out.println("Area of rectangle is" + length*breadth);
	}
	@Override
	//CalculatePerimeter Method
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of rectangle is:" + 2*(length+breadth));
	}

}
