package Array;

import java.util.Arrays;

public class inverseOfArray {
    public static void main(String[] args) {
        int[] arr={3,4,1,2,0};
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]=i;

        }
        System.out.println(Arrays.toString(arr1));
    }
}
