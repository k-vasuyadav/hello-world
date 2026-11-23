package com.javaintro;

public class Instancevariabkle {
	static String college_name="drk";
	static String college_id="21U51A6730";
	        String student_name="vasu";
             int studnet_Id=1922149356;
	public static void main(String[] args) {
// instance variable is a variable that belong to the object and it will be different from onr obj to another odj;
		System.out.println("college details");
				
			System.out.println("college_name :"+ Instancevariabkle.college_name);
			System.out.println( "college_id:"+ Instancevariabkle.college_id);
			
			//obj 
			Instancevariabkle sc=new Instancevariabkle();
			
			
			System.out.println("st name  :"+ sc.student_name);
			System.out.println("st id  :"+ sc.studnet_Id);


		
	}

}
