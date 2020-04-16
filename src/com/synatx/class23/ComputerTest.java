package com.synatx.class23;

public class ComputerTest {
	public static void main(String[] args) {
		Computer x=new Apple("Apple");
		Computer y=new Lenovo("Lenovo");
		Computer t=new HP("HP");
		Computer z=new Dell("Dell");
		Computer[]array= {x,y,t,z};
		for (Computer a:array) {
		a.internetConnection();
		a.software();
		}

}
}