package com.synatx.class22;

 class Degree {
	void getPrereq() {
		System.out.println("To get a degree you need a high school diploma");

	}class Bachelor extends Degree{
		
	}class Masters extends Degree{
		void getPrereq() {
			System.out.println("To get Masters you need to get BA degree first");
		}
	}

	public static void main(String[] args) {
		Degree x = new Degree();
		x.getPrereq();
		
		
	}

}
