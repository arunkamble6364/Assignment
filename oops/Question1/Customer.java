package com.oops.Question1;

public class Customer extends Person {
	int date_of_registration;
	long contactno;
	String delivery_address, email_id;

	void InitializePerson() {
		System.out.println("Initializing Person using super in Customer");
		super.setPid(101);
		System.out.println("Person Id      = " + super.getPid());
		super.setPname("Parvez");
		System.out.println("Person Name    = " + super.getPname());
		super.setPaddress("Pune");
		System.out.println("Person address = " + super.getPaddress());
		super.setDob(1995);
		System.out.println("Person DOB     = " + super.getDob());
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [date_of_registration=" + date_of_registration + ", contactno=" + contactno
				+ ", delivery_address=" + delivery_address + ", email_id=" + email_id + "]";
	}

	public Customer(int date_of_registration, long contactno, String delivery_address, String email_id) {
		super();
		this.date_of_registration = date_of_registration;
		this.contactno = contactno;
		this.delivery_address = delivery_address;
		this.email_id = email_id;
	}

	public int getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(int date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
