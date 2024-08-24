package com.iquest.basics;

public class ForLoop {

	public static void main(String[] args) {
		//Syntax 
		//for(Initialization ; condition ; increment/decrement )
		//for(int i=0; i<=24; i++) {
			//System.out.println("HEllo UNIVERSE");
		
		
		//Range starting from 0 to 20 print even number
		
		/*
		 * for(int i=0 ; i<=20 ; i++) { 
		 * if(i%2==0) 
		 * { 
		 * System.out.println(i); }
		 * 
		 * }
		 */
		
		//add all the integer 
		
		/*
		 * int sum=0; 
		 * for(int i=0 ; i<=5; i++) { 
		 * sum=sum+i; } System.out.println(sum);
		 */
		
		/*
		 * for (int j=0; j<4; j++) {
		 * 
		 * for(int i=0 ; i<=4; i++) {
		 * 
		 * System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */
		
		for(int j=0; j<4; j++) {
			
		for(int i=0 ; i<=j; i++) {
			
			System.out.print("*");	
		}
		
		System.out.println( );
	}
	
}
}
	  	
		


