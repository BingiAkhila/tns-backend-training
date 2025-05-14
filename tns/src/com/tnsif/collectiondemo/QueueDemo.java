package com.tnsif.collectiondemo;

import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args)
	{
	PriorityQueue<String> dq=new PriorityQueue<String>();
	dq.add("Sushma");
	dq.add("Harsha");
	dq.add("Bobby");
	dq.add("Varsha");
	for(String names:dq) {
	System.out.println(names);
	}
	PriorityQueue<Integer> d=new PriorityQueue<Integer>();
	d.add(876);
	d.add(78);
	d.add(634);
	d.add(1);
	for(int num:d) {
	System.out.println(num);
	}
	}

}
