/*
 *Task : Singleton
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.singleton;
//Class Sun using singleton design pattern
public class Sun {
	
   private static Sun obj;
   //private Constructor
   private Sun()
   {
	   System.out.println("Sun object is created");
   }
   //public static accessor method
   public static Sun  getInstance()
   {
	   if (obj==null)
	   {
		    obj=new Sun();
		    
	   }
	   else
	   {
		   System.out.println("Sun object is already created");
	   }
	   return obj;
   }
   public void  giveLight()
   {
	   System.out.println("Sun Gives Light");
   }
}
