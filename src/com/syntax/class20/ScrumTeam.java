package com.syntax.class20;

public class ScrumTeam extends Employee{

	String ceremonies;
	
	void attendMeetings() {
		System.out.println(" attends ceremonies "+ceremonies);
	}
}

 class ProductOwner extends ScrumTeam {
	void priorBacklog() {
		System.out.println("Product Owner prioritizes Backlog");
	}
}

 class ScrumMaster extends ScrumTeam {
	void navigateTeam() {
		System.out.println("Scrum Master navigates team");
	}
}

class Developer extends ScrumTeam{
	void coding() {
		System.out.println("Developer codes");
	}
}

class Tester extends ScrumTeam{
	void test() {
		System.out.println("Tester tests");
	}
}

class BusinessAnalyst extends ScrumTeam{
	void workWithReq() {
		System.out.println("BA works with requirements");
	}
}
