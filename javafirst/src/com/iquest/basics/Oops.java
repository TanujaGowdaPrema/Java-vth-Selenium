package com.iquest.basics;

public class Oops {

	public static void main(String[] args) {
 // syntax for creating an object : className objectName = new ClassName();
		                                       //           new = keyword classname =  

	
    car maruthi = new car(" Grey ", 4, 4);
	/*
	 * maruthi.color="Grey"; maruthi.noOfwheels =4; maru thi.seats=4;
	 */
    
    /*maruthi.start();*/
     
    System.out.println("color of maruthi car" +maruthi.color);
    
    /*System.out.println(maruthi.noOfwheels);
    System.out.println(maruthi.seats);*/
    
    car swift = new car("White", 4 ,5);
    System.out.println("color of swift car " + swift.color);
    System.out.println("color of swift car " + maruthi.color);
    
     
	
	}

}

class car {
	String color;
	int noOfwheels;
	int seats;
	
	car(String c, int w, int s) {
		//System.out.println("Car class  constructor has been called");
		this.color=c; 
		this.noOfwheels=w;
		this.seats=s;
		
	}
	public void start() {
		System.out.println("The car has started");
	}
	public void stop() {
		System.out.println("car stopped");
	}

	public void moveforward() {
		System.out.println("car is moving forward");
		

	}
	public void movebackward() {
		System.out.println("car is moving backward");
	}
   
	
	}
	
 


