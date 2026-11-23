package com.javaintro;

public class Staticvariables {
	static int student_id;
	static String student_name;

	public static void main(String[] args) {
		System.out.println("student details");

		student_id=21;
		student_name="vasu";
		System.out.println("studentid:"+ student_id);
		System.out.println("student_name:"+ student_name);
		System.out.println(Staticvariables. student_id);
		System.out.println(Staticvariables. student_name);
	}

}
