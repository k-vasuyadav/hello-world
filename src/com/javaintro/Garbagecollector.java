package com.javaintro;

public class Garbagecollector {
	 String garbagecollector;
	void hello() {// out of scope;
		System.out.println("hello method");
		Garbagecollector g4= new Garbagecollector();

	}
	
	protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
	}
		
	
		public static void main(String[] args) {
		System.out.println("main method started");
		Garbagecollector g1= new Garbagecollector();
		Garbagecollector g2= new Garbagecollector();
		Garbagecollector g3= new Garbagecollector();
		Garbagecollector g4= new Garbagecollector();
		   System.out.println(g4.garbagecollector);

		 
		Garbagecollector g5= new Garbagecollector();
		   System.out.println(g5.garbagecollector);
		   g4=g5;// island of isolation;
		   g5=g4;//



		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);

		
		g1=null;// nullifying the object
		g2= g3;// re- assigning the object
		new Garbagecollector().hello();// Anonymous object
		
		

		System.gc();


} 
	
	
	

	
}
