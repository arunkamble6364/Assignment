package com.oops.Question3;

public class Customer_Account_Statement {
	private String CAID;
	private String CustId;
	private String amount;
	private String deposit_withdrawl;
	private String deposit_date;

	public void customerDisplay() {
		System.out.println("CAID is:" + CAID + " CustId is:" + CustId + " amount is:" + amount
				+ " deposit_withdrawl is:" + deposit_withdrawl + " deposit_date is:" + deposit_date);
	}

	public Customer_Account_Statement(String cAID, String custId, String amount, String deposit_withdrawl,
			String deposit_date) {
		super();
		CAID = cAID;
		CustId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	public String getCAID() {
		return CAID;
	}

	public void setCAID(String cAID) {
		CAID = cAID;
	}

	public String getCustId() {
		return CustId;
	}

	public void setCustId(String custId) {
		CustId = custId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(String deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}
}
