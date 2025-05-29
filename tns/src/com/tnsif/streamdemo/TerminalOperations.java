package com.tnsif.streamdemo;
	import java.util.*;
	import java.util.stream.*;

	public class TerminalOperations {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

	        // forEach() - print each element
	        System.out.print("forEach: ");
	        numbers.stream().forEach(n -> System.out.print(n + " "));
	        System.out.println();

	        // collect() - collect numbers > 10 into a new list
	        List<Integer> greaterThanTen = numbers.stream()
	                .filter(n -> n > 10)
	                .collect(Collectors.toList());
	        System.out.println("collect: " + greaterThanTen);

	        // count() - count numbers greater than 10
	        long count = numbers.stream().filter(n -> n > 10).count();
	        System.out.println("count: " + count);

	        // findFirst() - get the first number
	        Optional<Integer> first = numbers.stream().findFirst();
	        first.ifPresent(n -> System.out.println("findFirst: " + n));

	        // findAny() - get any element (useful in parallel streams)
	        Optional<Integer> any = numbers.stream().findAny();
	        any.ifPresent(n -> System.out.println("findAny: " + n));

	        // anyMatch() - check if any number is > 20
	        boolean anyMatch = numbers.stream().anyMatch(n -> n > 20);
	        System.out.println("anyMatch (>20): " + anyMatch);

	        // allMatch() - check if all numbers are > 0
	        boolean allMatch = numbers.stream().allMatch(n -> n > 0);
	        System.out.println("allMatch (>0): " + allMatch);

	        // noneMatch() - check if no number is negative
	        boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);
	        System.out.println("noneMatch (<0): " + noneMatch);

	        // min() - find minimum number
	        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
	        min.ifPresent(n -> System.out.println("min: " + n));

	        // max() - find maximum number
	        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
	        max.ifPresent(n -> System.out.println("max: " + n));

	        // reduce() - sum of all numbers
	        int sum = numbers.stream().reduce(0, Integer::sum);
	        System.out.println("reduce (sum): " + sum);
	    }
	}


