package com.tnsif;
import java.util.Scanner;
public class IfElse2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1=s.nextInt();
		System.out.print("Enter second number:");
		int num2=s.nextInt();
		System.out.print("Enter third number:");
		int num3=s.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("The first number is greater");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("The second number is greater");
		}
		else {
			System.out.println("The third number is greater");
		}

	}

}
