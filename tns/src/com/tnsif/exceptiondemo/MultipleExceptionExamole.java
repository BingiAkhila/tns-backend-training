package com.tnsif.exceptiondemo;

public class MultipleExceptionExamole {
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30};
	        int result;

	        try {
	            // This will cause an ArithmeticException
	            result = numbers[1] / 0;
	            System.out.println("Result: " + result);

	            // This would cause an ArrayIndexOutOfBoundsException
	            System.out.println(numbers[5]);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception: Cannot divide by zero.");
	        } 
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array Index Out of Bounds Exception: Invalid index.");
	        } 
	        finally {
	            System.out.println("Finally block executed.");
	        }

	        System.out.println("Program continues...");
	    }
	}
