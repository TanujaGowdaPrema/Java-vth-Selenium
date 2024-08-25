package practice;


import java.util.Scanner;


public class Scannerinput {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your name? ");
		String name = sc.nextLine();
		
		System.out.println("how old are you? ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What is your favorite food?" );
		String food = sc.nextLine();
		
		System.out.println("Hello" +name);
		System.out.println("you are"+ age+"years old");
		System.out.println("you like"+ food);
		
	}

}
