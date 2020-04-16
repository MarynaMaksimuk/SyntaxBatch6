package com.syntax.class24;

public abstract class File {
	public abstract void open();
		
	public void edit() {
		System.out.println("The file can be edited");
		
	}public void close() {
		System.out.println("The file can be closed");
	}

}class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open java file we need notepad++");
		
	}
	
}class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open Word file we need Microsoft Office");
		
	}
	
}class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open PDF file we need Acrobat");
		
	}
	
}
