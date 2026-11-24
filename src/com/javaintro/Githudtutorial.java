package com.javaintro;

public class Githudtutorial {
   String name;
   int age;
   static int acc=101;
   String ifsc;
   
   {
	   acc++;
   }
   
    
     void displaydetails() {
    	 System.out.println("customer account number:"+ acc);
    	 System.out.println("customer name:"+ name);
    	 System.out.println("customer age:"+ age);
    	 System.out.println("customer ifsc:"+ ifsc);


    	 
     }
     static void method(){
    	 Githudtutorial Ac=new Githudtutorial();
    	

 		   Ac.age=23;
    	    Ac.name="om prakash";
    	    Ac.ifsc="BIKMP04";
    	    Ac.displaydetails();
    	    
    	    
    	  
 	Githudtutorial Ac02=new Githudtutorial();
 	   Ac02.age=24;
 	    Ac02.name="vasu";
 	
 	    Ac02.ifsc="BIKMP04";
 	    
          Ac02.displaydetails();
     }
	public static void main(String[] args) {
		method();
		
		 }

}
