package com.oops.Question10;

public class Product implements Cloneable {

	private int pid;
	private String pname;
	private double price;
	private String unit;

	public Product() {
		super();
	}

	public Product(int pid, String pname, double price, String unit) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unit = unit;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", unit=" + unit + "]";
	}

}
