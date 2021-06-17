/*
 *Task : Abstract class & final
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 13th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.shapes.squares;
//Importing Shape
import com.phoenix.shapes.Shape;
//Class Square
public class Square extends Shape{
    //FDeclaring & Initializing variable
	private int side;
	//Default Constructor
	public Square()
	{
		side=2;
		
	}
	//Parameterized Constructor
	public Square(int side)
	{
		this.side=side;
	
	}
	@Override
	//CalculateArea Method
	public void calculateArea()
	{  
		
		System.out.println("Area of square is :" + side*side );
	}
	@Override
	//CalculatePerimeter Method
	public void calculatePerimeter()
	
	{
		
		System.out.println("Perimeter of square is :" + 4*side );	
	}
	


}
