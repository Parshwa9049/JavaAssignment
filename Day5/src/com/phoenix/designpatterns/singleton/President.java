/*
 *Task : Singleton
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.singleton;
//Class President using singleton design pattern
public class President {
	private static President obj;
	   //private Constructor
	   private President()
	   {
		   System.out.println("President object is created");
	   }
	   //public static accessor method
	   public static President getInstance()
	   {
		   if (obj==null)
		   {
			    obj=new President();
			    
		   }
		   else
		   {
			   System.out.println("President object is already created");
		   }
		  
		   return obj;
	   }
	   public void representNation()
	   {
		   System.out.println("President represents Nation");
	   }

}
