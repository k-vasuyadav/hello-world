package com.javaintro;

public class Testdemo1 {
	public static void method3() {
		   Testdemo1 in= new Testdemo1();

        System.out.println("method3");
		method4();
		 in.method5();
		}
	public static void method4() {
		System.out.println("method4");
	}

	public static void main(String[] args) {
		System.out.println("main start ");

      method2();   
		System.out.println("main end ");
	}
	public static void method2() {
		System.out.println("method 2");

		method3();
		
	}
    void method5() {
	   System.out.println("method5 ");
	   
   }
   }
