package Numbers;

import java.util.Scanner;

public class digit_count{
    public static int digit_count(int num){
        int digit=0;
        while(num != 0){
            num/=10;
            digit++;
        }
        return digit;
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int res=digit_count(num);
        System.out.println(res);
      }
}