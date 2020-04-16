package com.synatx.class22;

public class Bank {
	//method overridden
	
	
	double money, fee;
	
	public Bank(double money){
		this.money=money;
	}
	
	void chargeFee() {
		if(money<1000) {
			fee=money*0.1;
		}else {
			fee=0;
		}
	}

}class BOA extends Bank{
	public BOA(double money) {
		super(money);
		
	}
	class TD extends Bank{
		public TD(double money) {
			super(money);
		}void chargeFee(){
			if (money<1000) {
				fee=money*0.3;
			}else {
				fee=0;
			}
		}
	}
}class PNC extends Bank{
	public PNC(double money) {
		super(money);
		
	}@Override
	void chargeFee(){
		if(money<1000) {
			fee=money*0.2;
		}else {
			fee=0;
		}
	}
}
