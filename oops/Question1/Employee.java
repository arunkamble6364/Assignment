package com.oops.Question1;

public class Employee extends Person {
	float salary;
	int date_of_joining;
	String base_location, emailid;
	int contactno;
	Department deptobj;

	void InitializePerson() {
		System.out.println("Initializing Person using super in Employee ");
		super.setPid(100);
		System.out.println("Person Id      = " + super.getPid());
		super.setPname("Arun");
		System.out.println("Person Name    = " + super.getPname());
		super.setPaddress("Kolhapur");
		System.out.println("Person address = " + super.getPaddress());
		super.setDob(1996);
		System.out.println("Person DOB     = " + super.getDob());
	}

	public float getSalary() {
		return salary;
	}

	public Employee() {
	}

	public Employee(float salary, int date_of_joining, String base_location, Department deptobj, String emailid,
			int contactno) {
		super();
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = deptobj;
		this.emailid = emailid;
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_location="
				+ base_location + ", deptobj=" + deptobj + ", emailid=" + emailid + ", contactno=" + contactno + "]";
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(int date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public Department getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(Department deptobj) {
		this.deptobj = deptobj;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

}
