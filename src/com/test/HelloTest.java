package com.test;

public class HelloTest {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People!");
		System.out.println("This app shows sales data");
	}
}
