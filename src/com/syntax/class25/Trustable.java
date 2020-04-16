package com.syntax.class25;

public interface Trustable {
	void trust();
}

interface Bank extends Trustable {
	void deposit();

	void withdraw();

}

class BOA implements Bank {

	@Override
	public void trust() {
		System.out.println("Bank of America is trustable");
	}

	@Override
	public void deposit() {
		System.out.println("You can deposit money");

	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw money from BOA");

	}

}interface CreditUnion{
	void giveCredit();
}