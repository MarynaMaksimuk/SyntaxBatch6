package com.synatx.class15;

public class Google {
	//define features like name, id, salary, title
	// define features like working, get paid, attending meetings
	
	int empId; //variables
	double salary;
	String name, lastName, title;
	
	void working() {// method heather
		//method body
		System.out.println(title+ " is working");
	}void getPaid(){
		System.out.println(name+" is geting paid "+salary);
	}void attendMeetings(){
		System.out.println(name+" attending meetings");
	}
	public static void main(String[]args) {
		Google emp1=new Google();
		emp1.empId=123;
		emp1.lastName="Smith";
		emp1.name="John";
		emp1.title="CEO";
		emp1.salary=200000;
		
		emp1.working();
		emp1.getPaid();
		emp1.attendMeetings();
		
	}

}
