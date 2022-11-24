package com.exceptions.exception2;

public class Salary {

	 private double da;
	    private double hra;
	    private double oth;
	    
	    
	    public void calculateTotal(int basic)
	    {
	        da = 0.90 * basic;
	        hra = 0.20 * basic;
	        oth = 0.10 * basic;
	        
	        double total = (basic + da + hra + oth);
	        
	        System.out.println("Basic Salary:\t" + basic);
	        System.out.println("Dearness Allowance:\t" + da);
	        System.out.println("House Rent Allowance:\t" + hra);
	        System.out.println("Other Allowances:\t" + oth);
	        System.out.println("Total Salary is: " + total);
	    }
}
