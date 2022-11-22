package com.oops.Question3;

public class Test {
	public static void main(String[] args) {
		Branch branch=new Branch("1", "HDFC Bank", " Pune");
		Customer customer=new Customer("1", "Sagar", "Hinjewadi", "8 July", "12 June", branch);
		Customer_Account_Statement cad=new Customer_Account_Statement("1", "32618", "10500", "3500", "15 sept");
		branch.BranchDisplay();
		customer.CustomerDisplay();
		cad.customerDisplay();
		
	}

}
