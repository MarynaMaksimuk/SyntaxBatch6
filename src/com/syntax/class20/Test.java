package com.syntax.class20;

public class Test extends ScrumTeam{
	public static void main(String[]args) {
		Employee.company="Wonderland";
		
		Employee emp1=new Employee();
		emp1.salary=40000;
		emp1.empNumber=1234;
		
		ProductOwner po=new ProductOwner();
		po.empNumber=3456;
		po.salary=150000;
		
		po.ceremonies="Sprint Grooming, Sprint planning, Sprint demo, Daily standup";
		po.attendMeetings();
		
		Employee.company="Synatx";
		po.work();
		
	}

}
