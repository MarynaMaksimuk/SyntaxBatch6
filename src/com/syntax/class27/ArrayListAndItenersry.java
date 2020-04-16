package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndItenersry {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("kinder");
		list.add("godiva");
		list.add("kit kat");
		list.add("snikers");
		
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("Cheese cake");
		sweets.addAll(list);
		System.out.println(sweets);
		
		//we want to iterate through the collection
		Iterator <String> x= sweets.iterator();
		if(x.hasNext()) {
			String element=x.next();
			System.out.println(element);
			if (element.equals("ice cream")) {
				x.remove();
			}
		}
		for (int i=sweets.size()-1; i>=0; i--) {
			System.out.println(sweets.get(i));
		}for (String str:sweets) {
			System.out.println(str);
		}
	}

}
