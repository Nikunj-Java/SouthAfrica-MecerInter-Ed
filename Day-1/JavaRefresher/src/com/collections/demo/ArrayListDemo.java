package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		System.out.println("Arraylist : "+list.size());
		
		list.add("Apple");
		list.add("Banana");
		list.add("cherry");
		list.add("Graps");
		list.add("Apple"); //duplicate value
		list.add(null);
		
		System.out.println("After Adding Elements: "+list.size());
		System.out.println(list);
		
		list.add("Pizza");
		
		System.out.println("After Adding Elements: "+list.size());
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		
		System.out.println(list.get(2));
		System.out.println(list.get(0));
		
		for(String s:list) {
			System.out.println("Using For Loop: "+s);
		}
		

		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Interator: "+itr.next());
		}
		
	}

}
