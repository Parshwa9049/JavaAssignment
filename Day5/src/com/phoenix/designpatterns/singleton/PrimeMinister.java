/*
 *Task : Singleton
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.designpatterns.singleton;
//Class PrimeMinister using singleton design pattern
public class PrimeMinister {
	private static PrimeMinister obj;
	   //private Constructor
	   private PrimeMinister()
	   {
		   System.out.println("PrimeMinister object is created");
	   }
	   //public static accessor method
	   public static PrimeMinister getInstance()
	   {
		   if (obj==null)
		   {
			    obj=new PrimeMinister();
			   
		   }
		   else
		   {
			   System.out.println("PrimeMinister object is already created");
		   }
		   
		   return obj;
	   }
	   public void serveNation()
	   {
		   System.out.println("PrimeMinister serves our Nation ");
	   }

}
