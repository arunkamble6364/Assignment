package com.exceptions.exception1;

public class Student {
	private int rollno;
	private String sname;
	private String saddress;
	private ResultException srobj;

	public ResultException getSrobj() {
		return srobj;
	}

	public void setSrobj(ResultException srobj) {
		this.srobj = srobj;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public static void main(String[] args) {

	}
}
