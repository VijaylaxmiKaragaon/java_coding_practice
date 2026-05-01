package Numbers;

import java.util.Scanner;

public class NeonNumber {
    public static int Neon(int num){
        int res=num*num;
        int sum=0;
        while (res != 0) {
            int rem=res%10;
            sum=sum+rem;
            res/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int res=Neon(num);
        if(num==res){
           System.out.println("Neon Number");
        } else{
            System.out.println("It is not Neon Number");
        }
    }
}
