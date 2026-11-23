package com.javaintro;

public class Employee {
   int id;
   String name;
   int salary;
   String dept;
   // constructor type1 of employee 
    Employee(){
    System.out.println("employee object created");
    }
    // constructor type2 of employee 

    Employee(int id, String name, int salary,String dept){
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    	this.dept=dept;
    }
    // void method to display details 

     void dispalydetails() {
    	 System.out.println("Id:"+ id);
 		System.out.println("Name:"+name);
 		System.out.println("salary:"+salary);
 		System.out.println("department:"+dept);
 		 }
     // void method to display only one variable; 

       void displayname() {
    	   System.out.println("Name:"+name);
       }
       // void method to calculate annual salary;
       void calculateannualsalary() {
    	   double annualsalary= salary*12;
    	   System.out.println("Annual salary:"+annualsalary);
    		   
    	  }
       // void method to hike salary based on department;

         void salaryhike(){
        	 salary=salary+(salary*10/100);
        	 System.out.println("salary 10% hike:"+salary);
       }
         // void method to check employee grade;
          void checkgarde() {
        	  if (salary>=80000) {
        		  System.out.println("Employee is in A grade");
        		  }
        	  else if(salary>=50000){
        	      System.out.println("Employee is in B grade");
          }
        	  else {
        	  System.out.println("Employee is in grade c");
          }
        	  
        	  
        	  }
       // void method to departmentBonus   
          double departmentBonus() {
        	  double bonus;
        	  if(dept.equals("deveolper")){
        		 bonus=salary*25/100;
        	  }
        	  else if(dept.equals("Testing")) {
        		  bonus=salary*15/100;
        	  }
        	  else if(dept.equals("HR")) {
        		  bonus= salary*30/100;

        	  }
        	  else {
        		  bonus=salary*50/100;
        	  }
        	  return bonus;
          
        	 // System.out.println("bonus amount:"+ bonus);

          }
          void finalsalary() {
        	  double bonus= departmentBonus();
        	  double finalsalary=salary+bonus;
        	  System.out.println("Final salary:"+ finalsalary);
          }
          
          // void update salary
          void updatesalary(int increment) {
        	  salary= salary + increment;
        	  System.out.println("updated salary:"+ salary);
        	 }


     public static void main(String[] args) {
		Employee e1=new Employee(101,"Nikil",72000,"deveolper");
		
		 
		//System.out.println("Employee id:"+ e1.id);
		//System.out.println("Employee name:"+e1.name);
		//System.out.println("Employee salary:"+e1.salary);
		//System.out.println("Employee dept:"+e1.dept);
		
		
		Employee e2=new Employee(102,"rahul",52000,"Testing");
		 
			System.out.println("Employee id:"+ e2.id);
			System.out.println("Employee name:"+e2.name);
			System.out.println("Employee salary:"+e2.salary);
			System.out.println("Employee dept:"+e2.dept);
			
			Employee e3=new Employee(103,"andria",45000,"HR");
			    System.out.println("Employee id:"+ e3.id);
				System.out.println("Employee name:"+e3.name);
				System.out.println("Employee salary:"+e3.salary);
				System.out.println("Employee dept:"+e3.dept);
				
				Employee e4=new Employee();
				e4.id=104;
				e4.name="scott";
				e4.salary=92000;
				e4.dept="IT";
				
				
                e1.displayname();
				e1.dispalydetails();
                e1.calculateannualsalary();
                e1.salaryhike();

                
                e2.displayname();

                e2.dispalydetails();
                e2.calculateannualsalary();
                e2.salaryhike();


                
                e3.displayname();

                e3.dispalydetails();
                e3.calculateannualsalary();
                e3.salaryhike();

                
                e4.displayname();

                e4.dispalydetails();
                e4.calculateannualsalary();
                e4.salaryhike();
                 
                e1.checkgarde();
                e2.checkgarde();
                e3.checkgarde();
                e4.checkgarde();
                 e1. departmentBonus();
                 e2. departmentBonus();
                 e3. departmentBonus();
                 e4. departmentBonus();
                 
                 
                 
                 e1.finalsalary();
                 e2.finalsalary();
                 e3.finalsalary();
                 e4.finalsalary();

                 e1.updatesalary(5000);
                 e2.updatesalary(5000);
                 e3.updatesalary(5000);
                 e4.updatesalary(5000);



       }

}
