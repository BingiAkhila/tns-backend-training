package com.tnsif.exceptiondemo;
	// Custom Exception for insufficient funds
	class InsufficientFundsException extends Exception {
	    public InsufficientFundsException(String message) {
	        super(message);
	    }
	}


