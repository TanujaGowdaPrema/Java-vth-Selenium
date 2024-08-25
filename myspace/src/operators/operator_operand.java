package operators;

public class operator_operand {

	public static void main(String[] args) {
		
		//Arithmetic operators==> only works on Numeric  
		// + - * / %
		
		int a = 20, b= 10;
		System.out.println("sum of a and b:"+(a+b));
		System.out.println("difference of a and b:"+(a-b));
		System.out.println("multiplication of a and b:"+(a*b));
		System.out.println("divition of a and b:"+(a/b));
		System.out.println("modulo division of a and b:"+(a%b));
	
	    // 5/2 gives Quotient          5%2 gives remainder
		//     2)5(2 ==> Quotient
		//		 4
		//     -----
		//       1 ==> remainder
		//
	
	         // or 
		
		int c = 30, d= 20;
		int result = c+d;
		System.out.println("sum of c and d:"+result);
	
	//  Relation /Comparison operators ==> > >= <= != ==
	//  always returns boolean value(true/false)	
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res = a<b;
		System.out.println(res);
		
		// Logical operators ----> && || !
		//  always returns boolean value(true/false)	
		// works between 2 boolean values
		
   //
		//      |  x    |   y   |  x&&y  |  x||y  |  !x   |  !y  |
		//     -------------------------------------------------
		//      | True  | True  |  True  | True   | False | False|
		//	    | True  | False |  False | True   | False | True |
		//      | False | True  |  False | True   | False | False|
		//      | False | False |  False | False  | False | True |
		
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1 = 30<90;
		System.out.println(b1); //false
		
		boolean b2 = 90>30;
		System.out.println(b2); //True
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		
		//System.out.println((10<5) && (20>10)); 
		
		
		
		
		
		
		
	}

}
