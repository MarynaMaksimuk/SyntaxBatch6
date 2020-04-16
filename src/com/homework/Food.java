package com.homework;

public abstract class Food {
	public abstract void taste();
	public abstract void color();
	public abstract void smell(); 
	String food;
	public Food(String food) {
		this.food=food;
	}
}class Pasta extends Food{
	public Pasta(String food){
		super(food);
	}

	@Override
	public void taste() {
		System.out.println("Pasta tastes good with marinara sause");
		
	}

	@Override
	public void color() {
		System.out.println("Pasta is usually white color");
		
	}

	@Override
	public void smell() {
		System.out.println("Past doesn't have strong smell");
		
	}
	
}class Steak extends Food{
	public Steak(String food) {
		super(food);
	}

	@Override
	public void taste() {
		System.out.println("Medium cooked steam tasts great");
		
	}

	@Override
	public void color() {
		System.out.println("Steak usually brown color");
		
	}

	@Override
	public void smell() {
		System.out.println("Steak smells like meat");
	}
	
}class sushi extends Food{
	public sushi (String food) {
		super(food);
	}

	@Override
	public void taste() {
		System.out.println("Sushi taste like fish");
		
	}

	@Override
	public void color() {
		System.out.println("Sushi usually multicolored");
		
	}

	@Override
	public void smell() {
		System.out.println("Sushi smell like fish");
		
	}
	
}class banana extends Food{
	public banana(String food) {
		super(food);
	}

	@Override
	public void taste() {
		System.out.println("Banana tasts good");
		
	}

	@Override
	public void color() {
		System.out.println("Banana is yellow");
		
	}

	@Override
	public void smell() {
		System.out.println("Banan smells great");
		
	}
	
}
