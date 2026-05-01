package Numbers;

import java.util.Scanner;

public class DisariumNumber {
    public static int count_digit(int num){
        int digit=0;
        while(num != 0){
            num/=10;
            digit++;
        }
        return digit;
    }
    public static int get_disarium(int num,int digit){
        int res=0;
        while(num != 0){
            int rem=num%10;
            res=res+(int)Math.pow(rem, digit);
            num/=10;
            digit--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int digit=count_digit(num);
        int res=get_disarium(num, digit);
        if(res==num){
            System.out.println("Disarium Number");
        } else{
            System.out.println("It is not Disarium");
        }
    }
}
