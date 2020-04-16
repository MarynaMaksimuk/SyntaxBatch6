package com.synatx.class22;

public class CreditCard {
	double balance;
	double interest;
	
	CreditCard(int balance){
		this.balance=balance;
	}
	void fee() {
		if (balance>500) {
			interest=balance*0.3;
		}
		System.out.println("The interest is "+interest);
	}

}class Visa extends CreditCard{
	
	Visa (int balance) {
		super(balance);
	}
		void fee() {
		if(balance>1000) {
			interest=balance*0.8;
		}System.out.println("Interest is "+interest);
	}
	
}class AX{
	
}
