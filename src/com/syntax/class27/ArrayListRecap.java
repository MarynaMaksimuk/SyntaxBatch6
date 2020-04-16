package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
	public static void main(String[] args) {
		
	
	ArrayList<Double> list=new ArrayList<>();
	list.add(10.99);
	list.add(12.90);
	list.add(100.90);
	System.out.println(list);
	
	//replace
	
	list.set(1, 13.90);
	System.out.println(list);
	
	// remove element
	
	list.remove(13.90);
	System.out.println(list);
	
	ArrayList obj=new ArrayList();
	obj.add("hello");
	obj.add(100);
	obj.addAll(list);
	
	System.out.println(obj);
	for (Object x:obj) {
		System.out.println(x);
		System.out.println("----------------");
		
		//iterator 
		Iterator<Double> iterator=list.iterator();
		double d=iterator.next();
		System.out.println(d);
	}
}}
