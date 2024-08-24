package com.iquest.basics;

public class Operators {

	public static void main(String[] args) {
		/*
		 * int a = 12; int b = 65; int c = a+b;
		 */
		//System.out.println(c);
		//System.out.println("Sum of a and b is :"+ c); //concatenation
		//System.out.println("Sum of " + a + " and "  + b + " is  :"+ c);
		//System.out.printf("Sum of %d and %d is %d " ,a,  b, c ); //formatting and parameterization of output string
		//System.out.println(a+b);
		
		
		//comparison /relation operaters
		
		// System.out.println(2==3);
		//System.out.println(4==9);
		
		
		//Logical Operators ===AND 
		 System.out.println(true && true);
		 System.out.println(true && false);
		 System.out.println(false && true);
		 System.out.println(false && false);
		 
		 //OR operator 
		 System.out.println(" Or Operator ");
		
		 System.out.println(true || true);
		 System.out.println(true || false);
		 System.out.println(false || true);
		 System.out.println(false || false);
		 
		 //Not Operator
		 
		 System.out.println(" not operator");
		 System.out.println(!true );
		 System.out.println(!false);
		 
		 //Bitwise Operators
		 
		 System.out.println("bitwise");
		 System.out.println(5 & 6);
		 System.out.println(5 | 6);
		 System.out.println(~5);
		 System.out.println(5 ^ 6);
		 
		 //Shift operator
		 
		 System.out.println("bitwise");
		 System.out.println(6<<8);
		 System.out.println(5>>2);
		 System.out.println(654>>5);
		 System.out.println(654<<5);
		 System.out.println(6>>8);
		 
		 //Ternary operator
		 
		 System.out.println("Ternary");
		 int k = 4;
		 int y = 8;
		 int r = 5;
		 System.out.println((k>y)? k : y);
		 //System.out.println((9<8)? 9 : 8);
		 System.out.println((k<r)? k : r);
		 System.out.println((k<y)? (k<r)? k:r :((y<r)? y:r));
		 
		 
	}

}
