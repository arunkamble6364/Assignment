package com.oops.Question9;

public class Employee {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	public Employee(int i) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    protected void finalize() throws Throwable {
        System.out.println("id= "+this.id);
    }
}
