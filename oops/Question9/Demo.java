package com.oops.Question9;

public class Demo {

	public static void main(String[] args) {
	       
		Employee e1=new Employee(501);
        Employee e2=new Employee(502);
        Employee e3=new Employee(503);
        Employee e4=new Employee(504);
        Employee e5=new Employee(505);
            
            e2=null;
            e5=null;
            System.gc();
            
            for(int i=1;i<6;i++) {
                String e="e"+i;
                System.out.println(e+":"+e.hashCode());
            }
            System.out.println("e2="+e2);
            System.out.println("e5="+e5);
            
    }
}
