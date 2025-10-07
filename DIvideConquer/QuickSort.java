package DIvideConquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5,-5};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int arr[], int start,int end){
        if(start>=end){
            return;
        }
        int pidx=partition(arr,start,end);
        quicksort(arr,start,pidx-1);
        quicksort(arr,pidx+1,end);
    }
    public static int partition(int arr[], int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for (int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

        }
        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }
}
