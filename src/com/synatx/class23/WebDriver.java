package com.synatx.class23;

public class WebDriver {
	public void open() {
		System.out.println("Opening browser");
	}

}class FireFoxDriver extends WebDriver{
	public void open() {
		System.out.println("Opening Firefor driver");
	}
}class ChromeDriver extends WebDriver{
	public void open() {
		System.out.println("Opening chrome browser");
	}
}class InternetExplorerDriver extends WebDriver{
	
}
