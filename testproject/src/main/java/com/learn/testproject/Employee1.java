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
	
	public void SetAttributes(String f, String l, int a, int s) {
		fname =f;
		lname=l;
		age=a;
		sal=s;
	
	}
	
	public void PrintEmp() {
		System.out.println(fname + " " + lname + " " + age + " " + sal);
	}
	
	public String PrintEmp1() {
		String d = fname + " " + lname + " " + age + " " + sal;
				return d;
	}
}
