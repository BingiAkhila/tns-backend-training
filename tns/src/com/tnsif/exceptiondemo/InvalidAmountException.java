package com.tnsif.exceptiondemo;
//Custom Exception for invalid amount
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

