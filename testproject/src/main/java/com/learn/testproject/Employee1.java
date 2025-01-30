package com.learn.testproject;

public class Employee1 {
	
	public String fname;
	public String lname;
	public int age;
	public int sal;
	

	public String FullName() {
		String name = fname + " " + lname;
		return name;
	}
	
	public String greet(String a) {
		String x = a + " " + fname;
		return x;
		
	}
}
