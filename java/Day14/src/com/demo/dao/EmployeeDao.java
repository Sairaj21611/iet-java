package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao  {

	boolean save(Employee e);

	List<Employee> getAll();

	boolean removeById(int empid);

	boolean updateById(int empid, double sal);

	Employee findById(int empid);

//	void readData(String fname);

	
}
