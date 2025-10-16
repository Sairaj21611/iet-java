package com.demo.dao;

import java.util.*;
import java.io.*;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> lst = new ArrayList<>();

	public EmployeeDaoImpl() {

	}

	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		return lst.add(e);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return lst;
	}

	@Override
	public boolean removeById(int empid) {
		// TODO Auto-generated method stub
		return lst.remove(new Employee(empid));
	}

	@Override
	public boolean updateById(int empid, double sal) {

		int pos = lst.indexOf(new Employee(empid));
		if (pos != -1) {
			((Employee) lst.get(pos)).setSalary(sal);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Employee findById(int empid) {
		int pos = lst.indexOf(new Employee(empid));
		return pos != -1 ? (Employee) lst.get(pos) : null;

	}

	
//	public void readData(String fname) {
//		File f = new File(fname);
//
//		if (f.exists()) {
//			try {
//				Throwable var3 = null;
//				Object var4 = null;
//				try {
//					ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname));
//
//					try {
//						Employee e = (Employee) ois.readObject();
//					} catch (Throwable var20) {
//						if (var3 == null) {
//							var3 = var20;
//						} else if (var3 != var20) {
//							var3.addSuppressed(var20);
//						} else {
//							throw var3;
//						}
//					} catch (EOFException var21) {
//						System.out.println("Reached to end of file");
//					}
//
//				} catch (FileNotFoundException var22) {
//					var22.printStackTrace();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			} catch (ClassNotFoundException var24) {
//				var24.printStackTrace();
//			}

		
	}


