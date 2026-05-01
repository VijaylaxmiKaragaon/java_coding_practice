package basics;

public class calling_userdefMtd {
    void hello() {
        System.out.println("this is a user defined method");

    }

    public static void main(String[] args) {
        calling_userdefMtd obj = new calling_userdefMtd();
        obj.hello();
    }
}
