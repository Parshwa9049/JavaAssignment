/*
 *Task : Abstract class & final
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 13th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.shapes.main;
//Importing classes
import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

//Class Abstract Main
public class AbstractMain {
    //MaionMethod
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating superclass reference of Shape
		Shape sh;
		// Creating object of Circle
		sh= new Circle(2.5f);
		sh.calculateArea();
		sh.calculatePerimeter();
		// Creating object of Rectangle
		sh = new Rectangle(2,4);
		sh.calculateArea();
		sh.calculatePerimeter();
		// Creating object of Square
		sh= new Square(4);
		sh.calculateArea();
		sh.calculatePerimeter();
		
		

	}

}
