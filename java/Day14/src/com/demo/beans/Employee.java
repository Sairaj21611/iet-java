package com.demo.beans;

public class Employee {
	private int eid;
	private String ename;
	private String desg;
	private double sal;
	
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String desg, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
		
	}
	 public boolean equals(Object obj) {
	      Employee other = (Employee)obj;
	      return this.eid == other.eid;
	   }
	
	public Employee(int eid) {
		super();
		this.eid = eid;
	}
	public double getSalary() {
		return sal;
	}
	public void setSalary(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return ename;
	}
	public void setName(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [Employee id : " + eid + ", Employee Name : " + ename + ", Designation : " + desg + ", Salary : =" + sal + "]";
	}
}




		
