package Abtraction.Assignment;

public class Employee {
    int id;
    String name;
    double salary;
    
    Employee(int id){
    	this(id,"Vijaylaxmi");
    }
    Employee(int id,String name){
    	this(id,name,100000.00);
    }
    Employee(int id,String name,double salary){
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    }
    	void display() {
    		System.out.println("Employee id:" + id);
    		System.out.println("Employee name:" + name);
    		System.out.println("Employee salary:" + salary);
  
    		
    	}
    }

