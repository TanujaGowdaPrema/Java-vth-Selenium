package practice;

public class RelationalOrComparison {

	public static void main(String[] args) {
		
//		2)	Relational/comparison operators	 	> >= < <= != == 
//      always returns boolean value - true/false
		
		int a = 20 , b=10;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		b = 20;								// no need to create a new datatype because already created so just change the value..
		
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res = a>b;
		System.out.println(a>b); 
		
		
		

	}

}
