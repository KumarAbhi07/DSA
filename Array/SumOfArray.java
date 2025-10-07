package Array;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SumOfArray {
    public static void main(String[] args) {
        int[] nums={1,23,4,5,6,5};
        int[] arr={9,1,23,4,7,6};

        int n=nums.length;
        int[] arr1=new int[n];
        for(int i= n-1;i>=0;i--){
                arr1[i]=nums[i]+arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
