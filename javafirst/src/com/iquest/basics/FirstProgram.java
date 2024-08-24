package com.iquest.basics;

import accessModifiers.*;

public class FirstProgram {

	public static void main(String[] args) {
		//System.out.println("Hello,Universe");
		//ProModifiers proObj3 = new ProModifiers();//default class ,not visible outside the package
		ProtectedModifiers objNew= new ProtectedModifiers(); //public class,visible outside the package
		//objNew.proM5();
		//System.out.println(objNew.age);//not visible
		//objNew.proM4(); //not visible
		
		ATM atmUser = new ATM();
		atmUser.Insertcard();
		atmUser.CashWithdraw();
		atmUser.EnterPin();
		atmUser.EnterAmount();
		atmUser.collectCash();
	}

}
class ProMchildTwo extends ProtectedModifiers{
	public void proM6() {
		System.out.println(age);
		proM4();
	}
}
