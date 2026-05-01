package Numbers;

public class DisariumNumber1To10000 {
    public static int Count_digit(int num){
        int digit=0;
        while(num !=0){
            num/=10;
            digit++;
        }
        return digit;
    }
    public static int get_ArmStrong(int num,int digit){
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
        for(int k=0;k<=10000;k++){
            int num=k;
            int digit=Count_digit(num);
            int res=get_ArmStrong(num, digit);
            if(num==res){
                System.out.println(num);
            }
        }
    }
}
