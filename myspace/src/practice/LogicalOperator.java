package practice;

public class LogicalOperator {

	public static void main(String[] args) {
//		3)	Logical operators		 			&& || !
//		returns boolean value -- true or false
//		works between 2 BOOLEAN variable
		
//		diff between relation and logical operator is ,in relation all kind of dataypes ,but in logical can use only boolean datatype
		
//		x      y      x && y     x || y 	!x      !Y
//	--------------------------------------------------------
//	  TRUE  TRUE	  TRUE  	  TRUE	   FALSE    FALSE
//	  TRUE  FALSE     FALSE       TRUE
//	  FALSE	TRUE	  FALSE       TRUE     TRUE
//	  FALSE	FALSE	  FALSE       FALSE				TRUE
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x&&y);  
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
			
	}

}
