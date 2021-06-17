/*
 *Task : Singleton
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.singleton;
//Class Earth using singleton design pattern
public class Earth {
	private static Earth obj;
	   //private Constructor
	   private Earth()
	   {
		   System.out.println("Object of Earth created");
	   }
	   //public static accessor method
	   public static Earth getInstance()
	   {
		   if (obj==null)
		   {
			    obj=new Earth();
			    
		   }
		   else
		   {
			   System.out.println("Earth object is already created");
		   }
		  
		   return obj;
	   }
	   //CreateLife Method
	   public void createLife()
	   {
		   System.out.println("Earth has life");
	   }

}
