/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.interfaces;

//Interface Jumpable
public interface Jumpable extends Movable{
	//Method jump()
     default void jump()
    {
    	System.out.println("Jumpable Interface");
    }
	
}
