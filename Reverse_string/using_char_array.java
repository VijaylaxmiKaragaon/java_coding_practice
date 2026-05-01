package Reverse_string;

public class using_char_array {
    public static void main(String[] args){
        String str="Java";
        char[] arr = str.toCharArray();

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}

//converts string to char[]
//useful when working at low level
