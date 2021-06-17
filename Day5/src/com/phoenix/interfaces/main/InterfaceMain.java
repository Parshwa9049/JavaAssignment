/*
 *Task : Interfaces
 *Author : parshwa.sheth@stltech.in
 *Creation-Date : 16th June-21
 *Version : 1.0
 *CopyRight : Parshwa Sheth
 */
package com.phoenix.interfaces.main;
//Importing classes and Interfaces
import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;
import com.phoenix.interfaces.Walkable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;

//Class Interface Main
public class InterfaceMain {
    
	// Main Method
	public static void main(String[] args) {
		
		//Reference of Movable Interface
		Movable m= null;
		System.out.println("Earth");
		//Object of Earth
		m = new Earth();
		((Earth)m).setMoons(1);
		m.toString();
		System.out.println(m);
		if(((Earth)m).supportsLife()==true)
			{
			System.out.println("Earth supports Life");
			}
		else
		{
			System.out.println("Earth Doesnot supports life");
		}
		
		((Earth)m).rotate();
		((Earth)m).revolve();
		((Earth)m).move();
		
		System.out.println("");
		
		
		//Object of Jupiter
		System.out.println("Jupiter");
		m = new Jupiter();
		((Jupiter)m).setMoons(79);
		m.toString();
		System.out.println(m);
		
		if(((Jupiter)m).supportsLife()== true)
				{
					System.out.println("Jupiter supports Life");
				}
				else
				{
					System.out.println("Jupiter doesnot supports Life");
				}
		
		((Jupiter)m).rotate();
		((Jupiter)m).revolve();
		((Jupiter)m).move();
		System.out.println("");
		
		//Object of Tiger
		System.out.println("Tiger");
		m = new Tiger();
		((Tiger)m).walk();
		((Tiger)m).jump();
		m.move();
		System.out.println("");
		
		//Object of Cat
		System.out.println("Cat");
		m = new Cat();
		((Cat)m).walk();
		((Cat)m).jump();
		m.move();
		System.out.println("");
				
		//Object of Car
		System.out.println("Car");
		m= new Car();
		((Car)m).move();
		((Car)m).run();
		((Car)m).start();
		((Car)m).stop();
		System.out.println("");
		
		//Object of Car
		System.out.println("HumanRobot");
		m = new HumanRobot();
		((HumanRobot)m).walk();
		((HumanRobot)m).senseInfo();
		((HumanRobot)m).processData();
		((HumanRobot)m).useArtificialIntelligence();
	}

}
