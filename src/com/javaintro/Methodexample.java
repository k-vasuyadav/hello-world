package com.javaintro;

public class Methodexample {
	
	public static void main() {
		System.out.println("main method starts");
		method2();
		System.out.println("main method ends");
}
	public static void method1( ) {
		System.out.println("method 1");
		  Methodexample tr= new Methodexample();

		tr.method3();
	}
	public static void method4( ) {
		method1();
		System.out.println("method 4");
	}
	public static void method2( ) {
		System.out.println("method 2");
		method4();
			}
	 void method3( ) {
		System.out.println("method 3");
		
		
		// main starts
		//method 2
		//method 1
		//method 3
		//method 
		//method 
		

		
	}



}
