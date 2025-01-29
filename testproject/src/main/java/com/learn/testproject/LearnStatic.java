package com.learn.testproject;

public class LearnStatic {
	public int age; // non-static member variable. 
					// Each object will have own copy. Needs object to be set
	public static int counter; // static member variable
					// Belongs to class. Doesn't need object to be set
	
	
	public void Hello()
	{
		System.out.println("Hello");
		System.out.println(counter);
	}
	
	public static void StaticHello()
	{
		System.out.println("Static Hello");
//		System.out.println(age);
	}
}
