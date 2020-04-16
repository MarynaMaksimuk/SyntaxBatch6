package com.syntax.class27;


import java.util.ArrayList;
import java.util.Iterator;

public class WordsItirator {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<>();
		array.add("hello");
		array.add("play");
		array.add("come");
		
		Iterator<String> x =array.iterator();
		while(x.hasNext()) {
			if(x.next().endsWith("e")) {
				x.remove();
			}
		}
		System.out.println(array);
	}

}
