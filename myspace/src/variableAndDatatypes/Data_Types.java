package variableAndDatatypes;

public class Data_Types {

	public static void main(String[] args) {
		
		//Numeric data types
		
		int a = 200, b= 300;
		System.out.println("the value of a is :"+a);
		System.out.println("The value of b is :"+b);
		System.out.println(a+b);
		//need to add statements in string nd then use sum operation
		System.out.println("the sum of a and b :"+(a+b)); 
		
		byte by = 125;
		System.out.println(by);
		
		short sh = 3535;
		System.out.println(sh);
		
		long l = 1223444556557l;// lower case or upper case l/L(called literal)
		System.out.println(l);
		long p = 122346786557L;// lower case or upper case l/L(called literal)
		System.out.println(p);
		
		//decimal numbers ===> float, double
		
		float item = 15.5f;  // add f literal F/f
		System.out.println(item);
		
		double dbl = 1234.58579;
		System.out.println(dbl);
		 
		 char grade = 'g'; // single character
		 System.out.println(grade);

		 String name = "baby"; // for multiple character
		 System.out.println(name);
		 
		 boolean bool = true;
		 System.out.println(bool); // can only store true or false 
		 boolean booll = false;
		 System.out.println(booll);
		
	}
}