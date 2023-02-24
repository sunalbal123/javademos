package com.teksystems;

public class Demo {

	public static void main(String[] args) {
		System.out.println("from main method");
		Demo obj = new Demo();
		
		
		
	}

	static {
		System.out.println("from static block");
	}
	{
		System.out.println("from non-static block");
	}
}
