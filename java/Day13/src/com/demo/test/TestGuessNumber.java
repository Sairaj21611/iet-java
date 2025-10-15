package com.demo.test;

import java.util.Scanner;
import com.demo.exceptions.*;

public class TestGuessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnum = 34;
		while(true) {
		try {
			System.out.println("Enter a Correct Number : ");
			int num = sc.nextInt();
			
			if(num==cnum) {
				System.out.println("Yes, Congrats ! Your guess it right");
				break;
				}
			if(num<cnum) {
				throw new WrongNumberException("No you missed it ! your number is smaller");
			}
			throw new WrongNumberException("No you missed it !Your number is greater");
		} catch(WrongNumberException e ) {
			System.out.println(e.getMessage());
		}
		
	}
	}
}
