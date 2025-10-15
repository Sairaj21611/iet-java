package com.demo.test;

import java.util.Scanner;
import com.demo.exceptions.*;

public class TestException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			try {
				System.out.print("Enter Salary : ");
				Double sal = sc.nextDouble();

				if (sal < 0) {
					throw new NegativeSalaryException("Salaray cannot be negative");
				}

				System.out.println("Salary is : " + sal);
				break;

			} catch (NegativeSalaryException e) {

				System.out.println(e.getMessage());
			}
		}
	}
}
