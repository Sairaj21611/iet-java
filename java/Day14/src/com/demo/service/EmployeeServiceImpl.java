package com.demo.service;

import com.demo.beans.*;
import com.demo.dao.*;
import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao = new EmployeeDaoImpl();

	public EmployeeServiceImpl() {
		super();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		int empid = sc.nextInt();

		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter designationi : ");
		String desg = sc.next();

		System.out.println("Enter Salary : ");
		double sal = sc.nextDouble();
		
		Employee e =  new Employee(empid,name,desg,sal);
		return edao.save(e);
	}

	@Override
	public List<Employee> DispAll() {
		// TODO Auto-generated method stub
		return edao.getAll();
	}

	@Override
	public boolean deleteById(int empid) {
		// TODO Auto-generated method stub
		return edao.removeById(empid);
	}

	@Override
	public boolean modifyById(int empid, double sal) {
		
		return edao.updateById(empid,sal);
	}

	@Override
	public Employee getById(int empid) {
		// TODO Auto-generated method stub
		return edao.findById(empid);
	}
//
//	@Override
//	public void readFile(String fname) {
//		this.edao.readData(fname);
//		
//	}

}
