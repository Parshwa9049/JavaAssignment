/*
 *Task : Abstract class & final
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 13th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.shapes.circles;
// Importing package
import com.phoenix.shapes.Shape;
// Class Circle
public class Circle extends Shape{
	
	
	//Declaring & Iniatializing radius 
	private float radius;
	//Default Constuctor
	public Circle()
	{
		radius=2;
		
	}
	//Parametrized Constuctor
	public Circle(float radius)
	{
		this.radius=radius;
	
	}
	@Override
	//CalculateArea Method
	public void calculateArea()
	{  
		double p = Shape.Math_PI;
		System.out.println("Area of circle is :" + p*radius*radius );
	}
	@Override
	//CalculatePerimeter Method
	public void calculatePerimeter()
	
	{
		double p1 = Shape.Math_PI;
		System.out.println("Perimeter of circle is :" + 2*p1*radius );	
	}
	

}
