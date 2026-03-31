package JavaLangPackage.program3;

public class Teacher {
     String tname;
   Student1 s;
   Teacher(String tname,Student1 s){
	   this.tname=tname;
	   this.s=s;
   }
   void display() {
	   System.out.println("Teacher: "+tname+"is teaching"+s.sname);
   }
}
