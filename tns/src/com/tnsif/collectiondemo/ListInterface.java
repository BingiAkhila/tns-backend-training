package com.tnsif.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
	    public static void main(String[] args) {
	        // Creating a list of Strings
	        List<String> list = new ArrayList<>();

	        // add(E e)
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Orange");
	        System.out.println( "The elements are:");
	        for(String i:list) {
	        System.out.println(i);
	        }
	        // size()
	        System.out.println("Size of list: " + list.size());

	        // isEmpty()
	        System.out.println("Is the list empty? " + list.isEmpty());

	        // contains(Object o)
	        System.out.println("Does list contain 'Banana'? " + list.contains("Banana"));

	        // iterator()
	        System.out.print("List elements using Iterator: ");
	        Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        
			// toArray()
	        Object[] array = list.toArray();
	        System.out.println("List converted to Array: " + Arrays.toString(array));

	        // remove(Object o)
	        list.remove("Cherry");
	        System.out.println("After removing 'Cherry': " + list);

	        // retainAll(Collection<?> c)
	        List<String> retainList = new ArrayList<>();
	        retainList.add("Apple");
	        list.retainAll(retainList);
	        System.out.println("After retaining 'Apple' only: " + list);

	        // add elements again
	        list.add("Mango");
	        list.add("Grape");
            System.out.println(list);
	        // get(int index)
	        System.out.println("Element at index 1: " + list.get(1));

	        // clear()
	        list.clear();
	        System.out.println(list);
	        System.out.println("After clearing list, is it empty? " + list.isEmpty());
	    }
	}

