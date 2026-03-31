package JavaLangPackage.program4;

public class Trainer {
    int id;
   String name;
   double salary;
   String sub;
   String email;
   Trainer(int id,String name,double salary,String sub,String email){
	   this.id=id;
	   this.name=name;
	   this.salary=salary;
	   this.sub=sub;
	   this.email=email;
   }
   @Override
   public String toString() {
	   return "Trainer[ID ="+id+",Name="+name+",Subject="+sub+",salary="+salary+"email-id:"+email;
   }
   @Override
   public int hashCode() {
	   return sub.hashCode();
   }
   @Override
   public boolean equals(Object obj) {
	   if(this == obj) return true;
	   if(obj instanceof Trainer) {
		   Trainer t=(Trainer)obj;
		   return this.sub.equals(t.sub);
	   }
	   return false;
   }
}
