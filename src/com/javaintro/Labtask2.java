package com.javaintro;

public class Labtask2 {
	 String name;
	 int age;
	 String college;
	 
 public static void main(String[] args) {
	 staticmethod();
 }
  static void staticmethod() {
	  Labtask2 l= new Labtask2();
	   l.name="vasu";
	   l.age=23;
	  l.college="Drk college of engineering and techonology";
     l.instancemethod();

  }
   void  instancemethod() {
	   System.out.println("student name:"+ name);
	   System.out.println("student age:"+ age);
	   System.out.println("student college:"+college);


   }
} 

