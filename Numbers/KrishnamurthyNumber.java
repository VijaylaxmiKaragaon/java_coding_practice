package Numbers;

import java.util.Scanner;

public class KrishnamurthyNumber {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    public static int get_KrishnamurthyNum(int num){
         int res=0;
        while(num != 0){
            int rem=num%10;
            res=factorial(rem)+res;
            num/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int fact=factorial(num);
        int res=get_KrishnamurthyNum(num);
         if(num==res){
            System.out.println("Krishnamurthy Number");
         } else{
            System.out.println("It is not Krishnamurthy Number");
         }
    }
}
