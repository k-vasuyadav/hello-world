package com.javaintro;

public class Static {

	 static public void main(String[] args) {
		  main1();
	
    System.out.println("main method");

   }
static void main1() {
	System.out.println("static method 1");
	main2();}
	  
static void main2(){
	System.out.println("static method 2");
	Static in=new Static();
	   in.instance1();
	   in.instance2();
	}

  void instance1(){
	System.out.println("instance method 1");
	}
   void instance2(){
	System.out.println("instance method 2");

}
    void divider(){
	System.out.println("==========================================================");

}
}

