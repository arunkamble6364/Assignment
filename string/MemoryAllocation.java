package com.string;

public class MemoryAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s1=new String("Arun"); 
	        
	        String s2=new String("Arun"); 
	        
	        String s3="Arun";
	        
	        String s4="Arun"; 
	        
	        System.out.println("s1: "+s1.hashCode());
	        System.out.println("s2: "+s2.hashCode());
	        System.out.println("s3: "+s3.hashCode());
	        System.out.println("s4: "+s4.hashCode());
	        
	        System.out.println(s1.equals(s3)); 
	        System.out.println("In Heap memory: "+s1==s3);
		
	}

}
