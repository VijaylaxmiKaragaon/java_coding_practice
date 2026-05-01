package Numbers;

import java.util.Scanner;

public class FactorialNumber {
    public static int fact_number(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int res=fact_number(num);
        System.out.println(res);
    }
}
