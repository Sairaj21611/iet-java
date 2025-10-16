package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> DispAll();

	boolean deleteById(int empid);

	boolean modifyById(int empid, double sal);

	Employee getById(int empid);

	//void readFile(String fname);

	
	

}
