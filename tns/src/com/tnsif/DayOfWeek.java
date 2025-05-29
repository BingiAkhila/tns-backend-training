package com.tnsif;
import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.print("Enter a number:");
	int n=in.nextInt();
	if(n==1) {
		System.out.println("Sunday");
	}
	else if(n==2) {
		System.out.println("Monday");
		
	}
	else if(n==3) {
		System.out.println("Tuesday");
	}
	else if(n==4) {
		System.out.println("Wednesday");
		
	}
	else if(n==5) {
		System.out.println("Thursday");
	}
	else if(n==6) {
		System.out.println("Friday");
	}
	else {
		System.out.println("Saturday");
	}
	}

}
