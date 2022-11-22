package com.oops.Question3;

public class Branch {
	private String branch_id;
	private String branch_name;
	private String branch_address;

	public void BranchDisplay() {
		System.out.println(
				"branch_id is:" + branch_id + " branch_name is:" + branch_name + " branch_address is" + branch_address);
	}

	@Override
	public String toString() {
		return "Branch_Obj [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_address="
				+ branch_address + "]";
	}

	public Branch(String branch_id, String branch_name, String branch_address) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_address = branch_address;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getBranch_address() {
		return branch_address;
	}

	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}

}
