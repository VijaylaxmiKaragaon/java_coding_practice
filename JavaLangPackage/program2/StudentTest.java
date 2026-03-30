package JavaLangPackage.program2;

public class StudentTest {
    public static void main(String[] args) {
		Student s1 = new Student(1,"Vijaylaxmi");
		Student s2 = new Student(2,"Tejuu");
		Student s3 = new Student(1,"Vijaylaxmi");
		System.out.println("Student 1 details:"+s1);
		System.out.println("Student 2 Details:"+s2);
		
		System.out.println("s1 hashcode:"+s1.hashCode());
		System.out.println("s2 hashcode:"+s2.hashCode());
		System.out.println("s3 hashcode:"+s3.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s3);
		System.out.println(s1==s2);
	}

}
