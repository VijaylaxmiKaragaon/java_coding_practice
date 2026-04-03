package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int res = (a>b) ? a : b;
        System.out.println(res); //30
        
        int c = 30;
        int d = 30;
        int res1 = (a>b) ? c : d;
        System.out.println(res1); //30
        //when both are equal it will goes to else part
	}
}
