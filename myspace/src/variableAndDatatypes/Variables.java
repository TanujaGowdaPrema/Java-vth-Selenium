package variableAndDatatypes;

public class Variables {

	public static void main(String[] args) {
		
		int a;     // declaration
		a = 100;    //assignment
		System.out.println(a);
		
		int x = 100;   //declaration +  assignment
		System.out.println(x);
		x= 200;
		System.out.println(x); //changing  the value
		
		float price = 10.2f;
		System.out.println(price);
		
		String name = "John";
		System.out.println(name);
		
		char grade = 'A';
		System.out.println(grade);
		
		// Approach 1 ====>if all the variables belongs to different data types
		int d = 300;
		int e = 500;
		int r = 600;
		float prices = 11.2f;
		System.out.println(d);
		System.out.println(e);
		System.out.println(r);
		System.out.println(prices);
		
		// Approach 2 ====> if all the variables are belongs to same data types
		int t,k,l;
		t = 900;
		k = 800;
		l = 000;
		System.out.println(t);
		System.out.println(k);
		System.out.println(l);
		
		// Approach 3 ====>if all the variables are belongs to same data types
		
		int u=23, y=456, i=789;
		System.out.println("the value of a is"+u); //concatenation add + is 
		System.out.println("the value of a is"+y);
		System.out.println(i);
		
        System.out.println(u+" "+y+" "+i);//should add string here otherwise it will 
        									//add the numbers
	
	}

}
