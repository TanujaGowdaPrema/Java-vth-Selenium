 package operators;

public class Increment_Operator {

	public static void main(String[] args) {
		
		// case 1
		 int a = 90;
		 System.out.println(a); // 90
		 
		 a++;    // or a=a+1 u can use this 
		 System.out.println(a); // 91
		 
		 // case 2 --- post Increment 
		 
		 int b = 10;
		 int result = b++;
		 System.out.println(result); // 10 
//it doesn't increment bcz it assign b to result first then increment is assign to result
		  
		 
		 //case 3 ---> post increment
		 
		 int c = 10;
		 int res= ++c;
		 System.out.println(res); // 11
//it increment bcz it assign ++ to result first then c is assign to result.
		 
		 

		 
		 
		 

	}

}
