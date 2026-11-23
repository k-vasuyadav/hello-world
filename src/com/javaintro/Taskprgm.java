package com.javaintro;

public class Taskprgm {
	static void main1(){
		System.out.println("static 1");
	 

  }		

	
		static void main2(){
		System.out.println(" static 2 ");
			Taskprgm is=new Taskprgm();

			//instance method1 calling
			 is.main3();
			 is.main3();
	}
		  void main3(){
		System.out.println("instance 1");
		
	}
	   void  main4(){
		System.out.println("instance 1");
	}
	public static void main(String[] args) {
		System.out.println("main method executed");
		 main1();
		 main2();
 }

	
}
