package Arrays;

public class MaxMinElement {
    public static int MaxMin(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr={20,30,45,65,78,90};
        int index=MaxMin(arr);
        System.out.println(index);
    }
}
