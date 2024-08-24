package com.iquest.basics;

public class Switch {

	public static void main(String[] args) {
		int day = 9;
		switch (day) {
		case 1:
			System.out.println("Today is sunday");
			break;
			
		case 2:
			System.out.println("Today is monday");
			break;
			
		case 3:
			System.out.println("Today is Tuesday");
			break;
			
		case 4:
			System.out.println("Today is wednesday");
			break;
			
		case 5:
			System.out.println("Today is Thursday");
			break;
			
		case 6:
			System.out.println("Today is friday");
			break;
			
		case 7:
			System.out.println("Today is saturday");
			break;
			
		default:
			System.out.println("please enter a vaild number");
			break;
			
		}

	}

}
