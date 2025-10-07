package DIvideConquer;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={1,5,2,7,8,9,67,0};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergesort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid =si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
    public static void merge(int[] arr, int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    k++;i++;

            }
            else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}
