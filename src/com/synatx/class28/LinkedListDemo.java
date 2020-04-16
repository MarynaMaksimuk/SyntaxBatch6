package com.synatx.class28;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<>();
		list.add("John");
		list.add("Mary");
		list.add("Claus");
		int x= list.size();
		System.out.println(x);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
