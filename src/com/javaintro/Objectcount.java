package com.javaintro;

public class Objectcount {
	static int x=0;
     // static Objectcount ob2=new Objectcount();

	
  static {
	    Objectcount ob2=new Objectcount();
	    Objectcount ob4=new Objectcount();
 }
	public static void main() {
		System.out.println("main method starsts");
	    Objectcount ob=new Objectcount();
	    Objectcount ob1=new Objectcount();
	      System.out.println("object count: "+ x); 

	}
      {
    	 System.out.println("instance method");
    	 x++;
  }
}
