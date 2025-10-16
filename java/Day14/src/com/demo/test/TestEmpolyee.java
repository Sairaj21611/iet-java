package com.demo.test;

import java.util.*;

import com.demo.beans.Employee;
import com.demo.service.*;
import com.*;

public class TestEmpolyee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServiceImpl();
		//eservice.readFile("empdata1.txt");

		int choice = 0;
		do {
			System.out.println(
					"1.Add New Employee\n2.Display All \n3.delete by id \n4.modify by id \n5.display by id  \6exit n\nEnter choice ");
			System.out.println();
			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				boolean status = eservice.addNewEmployee();
				if (status) {
					System.out.println("Added Successfully");
				} else {
					System.out.println("not added ");
				}
			}
			case 2 -> {
				List<Employee> emp = eservice.DispAll();
				emp.forEach(System.out::println);
			}
			case 3 -> {
				System.out.print("Enter id : ");
				int empid = sc.nextInt();
				boolean status = eservice.deleteById(empid);
				if (status) {
					System.out.println("deleted successfully");
				} else {
					System.out.println("Not found");
				}
			}
			case 4 -> {
				System.out.println("Enter id");
				int empid = sc.nextInt();
				System.out.println("enetr new sal");
				double sal = sc.nextDouble();
				boolean status = eservice.modifyById(empid, sal);
				if (status) {
					System.out.println("modified successfully");
				} else {
					System.out.println("Not found");
				}
				break;
			}
			case 5 -> {
				System.out.println("Enter id");
				int empid = sc.nextInt();
				Employee ob = eservice.getById(empid);
				if (ob != null) {
					System.out.println(ob);
				} else {
					System.out.println("not found");
				}
			}
			case 6 -> {
				sc.close();
				System.out.println("Thank you ! jevlya shivay jau naye ");
			}
			default -> {
				System.out.println("Enter valid Choice ");
			}
			}
		} while (choice != 6);
	}
}
