package com.oops.Question1;

public class Department {
	int deptid;
	String dname;

	public Department(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}

	public void display() {
		System.out.println("department id is: " + deptid + " " + "and department name is: " + dname);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + "]";
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
