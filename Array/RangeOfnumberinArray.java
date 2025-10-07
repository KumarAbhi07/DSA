package Array;

import java.util.Arrays;

public class RangeOfnumberinArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,5,6,6,6,7,7,7,7,7,7,8,8};
        int target=7;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    public static int[] search(int[] arr,int tar){
        int first=firstindex(arr,tar);
        int last=lastindex(arr,tar);
        return new int[]{first,last};
    }
    public static int firstindex(int[] arr, int tar){
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==tar){
                ans=mid;
                end=mid-1;

            }
            if(tar<arr[mid]){
                end=mid-1;
            }
            else if(tar>arr[mid]){
                start=mid+1;
            }
        }
        return ans;
    }
    public static int lastindex(int[] arr, int tar){
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==tar){
                ans=mid;
                start=mid+1;

            }
            if(tar<arr[mid]){
                end=mid-1;
            }
            else if(tar>arr[mid]){
                start=mid+1;
            }
        }
        return ans;
    }
}