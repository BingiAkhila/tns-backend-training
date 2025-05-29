package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(10);
		ll.add(34);
		ll.add(23);
		ll.add("Sri indu");
		ll.add(3.8f);
		ll.add(true);
		System.out.println("The elements are:");
		for(Object i:ll) {
			System.out.println(i);
			
		}

	}

}
