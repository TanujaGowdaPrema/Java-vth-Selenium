package operators;

public class Decrement_operator {

	public static void main(String[] args) {
		
		// case 1
		
		int y = 80;
		y--;  //y = y-1;
		System.out.println(y);// 79
		
		
	// case 2 ---> post decrement
		
		int u = 40;
		int result = u--;
		System.out.println(result); //40  
		System.out.println(u); // 39 why?
// bcz u value will assign to result first and then decrement -- is assignning to result ...
	
	// case 2 ---> pre decrement
	
		 int l = 40;
		 int res = --l;
		System.out.println(res); //39  why?
// bcz u -- assign first and then assign the value l  to result ...
	
	
	}

}
