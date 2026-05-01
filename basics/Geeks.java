package basics;

abstract class calling_abstractMtd {
    abstract void check(String name);
}

public class Geeks extends calling_abstractMtd{
    @Override
    void check(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks();
        obj.check("GeeksforGeeks");
    }
}
