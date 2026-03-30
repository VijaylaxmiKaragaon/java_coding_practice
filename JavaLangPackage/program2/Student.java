package JavaLangPackage.program2;

public class Student {
     int Rollno;
   String name;
   Student(int Rollno,String name){
	   this.Rollno=Rollno;
	   this.name=name;
   }
   @Override
   public String toString() {
	   return "Roll Number:"+Rollno+", name: "+name;
   }
   @Override
   public int hashCode() {
	   return Rollno;
   }
   @Override
   public boolean equals(Object obj) {
	   if(obj instanceof Student) {
		   Student s = (Student)obj;
		   return this.Rollno == s.Rollno;
	   }
	   return false;
   }
}
