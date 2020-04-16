package com.synatx.class22;

public class Employee {
	double salary;

	void getpaid() {
		System.out.println("Employee gets paid " + salary);
	}

	void work() {
		System.out.println("Employee works");
	}

}

class fullTime extends Employee{

}class partTime extends Employee{
	
}class contractor extends Employee{
	void getpaid() {
		System.out.println("Contractor is getting paid hourly");
	}
}
