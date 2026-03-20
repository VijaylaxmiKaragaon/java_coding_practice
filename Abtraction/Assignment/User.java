package Abtraction.Assignment;

public class User extends Bank{
	   int userId;
       int password;
       
       User(String name,int userId,int password){
    	   super(name);
    	   this.userId=userId;
    	   this.password=password;
       }
       
       @Override
       void login() {
    	   System.out.println("User logged in");
       }
}
