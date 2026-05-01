package basics;

public class CallStackExample {
    public static void D(){
        float d = 40.5f;
        System.out.println("in method D");

    }

    public static void C() {
        double c = 30.5;
        System.out.println("in method c");

    }
    public static void B(){
        int b =20;
        C();
        System.out.println("in method B");

    }
    public static void A(){
        int a=10;
        B();
        System.out.println("in method A");

    }
    public static void main(String[] args) {
        A();
        D();
    }
}
