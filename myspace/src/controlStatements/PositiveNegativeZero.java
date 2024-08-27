package controlStatements;

public class PositiveNegativeZero {

	public static void main(String[] args) {
//	 int num = 9;
//	  if(num>0)
//	  {
//		  System.out.println("positive number");
//	  }
//	  else if(num<0)
//	{ System.out.println("negative");
//		
//	}
//	  else {
//		  System.out.println("zero");
//	  }
//	}
	
//	int a = 30;
//	if (a>=30)
//	{
//		System.out.println("gratest number");	
//	}
//	else if(a<=10)
//	{
//		System.out.println("smallest number");
//	}
	
//  a = 10, b = 20, c= 30
//	a>b and a>c ====a is largest
//	b>a and c>a ====b is largest
//	c>a and a>b ====c is largest
	
	int a =100,b=200,c=300;
	if ((a>b) && (a>c))
	{
		System.out.println("a is largest number");
	}
	else if ((b>a) && (b>c))
	{
		System.out.println("b is largest number");
	}  
	else {
		System.out.println("c is largest number");
	}
	}
}


