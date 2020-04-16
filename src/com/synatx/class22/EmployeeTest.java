package com.synatx.class22;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.salary=80000;
		emp.getpaid();
		
		fullTime emp1=new fullTime();
		emp1.salary=90000;
		emp1.getpaid();
		
		contractor emp2=new contractor();
		emp2.getpaid();

	}

}
