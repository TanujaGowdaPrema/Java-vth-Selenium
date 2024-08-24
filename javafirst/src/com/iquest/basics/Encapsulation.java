/*encapsulation 
    Access modifiers -- 
    
    Types:-
    
    1) Private - within that class
    2) Public - can access everywhere
    3) Protected - 
    4) Default - 
     
   
   
   
   
*/
package com.iquest.basics;

public class Encapsulation {

	public static void main(String[] args) {
	Banking sbi = new Banking();
	sbi.deposit(1000);
	
		
	}
	}
class Banking {
	//account,balance,amount
	//deposit ,withdraw,balance=check
	private int balance;
	
	public void deposit(int amount) {
		if(amount>0) {
			balance=balance+amount;
			//getBalance();
			
			//System.out.println("your balance is "+balance);
			
		}else { 
			//balance=balance+amount;
		
		System.out.println("your balance is "+balance);
	}
} 
}

	
class ATM {
		//Public = insert card , enter pin, account type, enter amount ,cash withdraw
		//private = card validation, pin validation,account selection,amount validation,balance upadate
		
	public void Insertcard() {
			System.out.println("Insert the card");
			CardValidation();
		}
	public void EnterPin() {
		System.out.println("Enter the pin");
		PinValidation();
		}
	public void accountType() {
		System.out.println("Account type selected");
		AccountSelection();
		}
	public void EnterAmount() {
		System.out.println("Enter the Amount");
		BalanceAvailbility();
		BalanceUpdate();
	    }

	public void CashWithdraw() {
		System.out.println("Cash withdraw");
	}
	
	
	
	
	private void CardValidation() {
		System.out.println("Card Validation ");
	}
	private void PinValidation() {
		System.out.println("Pin validation");
	}
	private void AccountSelection() {
		System.out.println("Account Selection");
		
	}
	private void Amountvalidation() {
		System.out.println("Amount Validation");
		
	}
	private void BalanceAvailbility() {
		System.out.println("BalanceAvailbility");
	}
	private void BalanceUpdate() {
		System.out.println("Balance Update ");
	}
	}
		


