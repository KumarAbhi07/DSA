package Array;

import java.util.Arrays;

public class ReverseInArray {
    public static void main(String[] args) {
        int[] arr={12,3,4,56,7,6};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
