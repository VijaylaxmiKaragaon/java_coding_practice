package JavaLangPackage.program4;

public class TrainerTest {
    public static void main(String[] args) {
		Trainer t1= new Trainer(101,"Sanjay",100000.00,"Java","Sanjay.r@dheecodinglab.com");
		Trainer t2 = new Trainer(102,"Ravishashtry",150000.00,"Front-end","ravishastry@dheecodinglab.com");
		Trainer t3 = new Trainer(103,"Punit",200000.00,"Java","punit@dheecodinglab.com");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		System.out.println("t1 hash :"+t1.hashCode());
		System.out.println("t2 hash :"+t2.hashCode());
		System.out.println("t3 hash :"+t3.hashCode());
		
		System.out.println(t1.equals(t2));
		System.out.println(t1==t3);
		System.out.println(t1.equals(t3));
	}
}
