package Numbers;

import java.util.Scanner;

public class ArmStrongNumber {
    public static int count_digit(int num){
        int digit=0;
        while(num != 0){
          num/=10;
          digit++;
        }
       return digit;
    }
    public static int armstrong_number(int num,int digit){
        int res=0;
        while(num != 0){
            int rem=num%10;
            res=res+(int)Math.pow(rem, digit);
            num/=10;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int res=count_digit(num);
        int res2=armstrong_number(num, res);
        if(num==res2){
            System.out.println("ArmStrong Number");
        } else{
            System.out.println("not ArmStrong number");
        }
    }
}
