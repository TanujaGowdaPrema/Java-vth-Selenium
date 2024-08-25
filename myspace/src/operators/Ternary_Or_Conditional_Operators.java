package operators;

public class Ternary_Or_Conditional_Operators {

	public static void main(String[] args) {
		
	//	syntax ==>  var=exp?result1:result2;
   
		  int a = 100,b = 200;
		  
		 int x = (a<b)?a:b;
		 //int y = (a>b)?a:b;
		 System.out.println(x);
		
		 int f = (1==1)? 10:20;
		 System.out.println(f);
		 
		 int i = (1==2)? 10:20;
		 System.out.println(i);
		 
		 int persob_age = 18;
		 String res=(persob_age >= 18)? "Eligiable" :"non Eligiable";
		 System.out.println(res);
		 }

}
