package com.syntax.class24;

public abstract class Phone {
	public void call() {
		System.out.println("my phone can call");
	}

	public void text() {
		System.out.println("my phone can text");
	}

	public abstract void takePic();
	public abstract void playMusic();
}
class iPhone extends Phone{

	@Override
	public void takePic() {
		System.out.println("iPhone Takes pics");
		
	}

	@Override
	public void playMusic() {
		System.out.println("iPhone play music");
	}
	
}