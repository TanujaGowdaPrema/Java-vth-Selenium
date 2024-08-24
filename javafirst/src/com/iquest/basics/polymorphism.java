package com.iquest.basics;

public class polymorphism {

	public static void main(String[] args) {
	
		Maths calculator= new Maths();
		int total = calculator.sum(1, 6, 8);
		System.out.println("Total= "+total);
		calculator.divide(total,2);
		

	}
}
class Maths { 
	public int sum(int a, int b, int c) {
		int total= a+b+c;
		//System.out.printf("Sum of %d, %d, %d is %d", a, b, c, total);
		//System.out.println();
		return total;
		
	}
	
	public void sum(double a, int b, int c) {
		double total= a+b+c;
		System.out.printf("Sum of %f, %d, %d is %f", a, b, c, total);
		System.out.println();
	}
	public void divide(double dividend, double divisor) {
		double quotient = dividend/divisor;
		System.out.println(quotient);
	}
		

	}

/*			Maths calculator= new Maths();
calculator.sum(4, 7, 0);
calculator.sum(4.8, 5, 3);

}		

}
class Maths {
public void sum(int a, int b, int c) {
	int total= a+b+c;
	System.out.printf("Sum of %d, %d, %d is %d", a, b, c, total);
	System.out.println();

}

public void sum(double a, int b, int c) {
	double total= a+b+c;
	System.out.printf("Sum of %f, %d, %d is %f", a, b, c, total);
	System.out.println();
}


}*/


