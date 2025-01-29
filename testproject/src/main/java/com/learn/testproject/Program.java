package com.learn.testproject;

public class Program {
	
	public int var1;
	public static int var2;
	
	public void myFunction(int m, int n) {
		System.out.println(var1);
	}
	

	public static void main(String[] args) {
		
		Program obj1 = new Program();
		obj1.myFunction(10, 20);
		
		Program.myFunctions(25, 35);
		
		
		Program.var2 = 25;
		obj1.var1 = 10;
		
		Program obj2 = new Program();
		obj2.var1  = 10;
		obj2.myFunction(1, 2);
	
		Program obj3 = new Program();
		obj3.var1 = 20;
		obj3.myFunction(3, 4);
		
		Program obj4 = new Program();
		obj4.var1 = 30;
		obj4.myFunction(5, 6);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void myFunctions(int p, int q) {
		
		
	}
	
}

