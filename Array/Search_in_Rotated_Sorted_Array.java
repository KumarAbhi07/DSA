package Array;

import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        System.out.println(RSBS(arr,tar));
    }
    public static int RSBS(int[] arr, int tar){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(arr[start]<=tar && tar<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<=tar&&tar<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;

    }
}
