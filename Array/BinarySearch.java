package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,9,10,15,18,19,20,22,25,36};
        int k=25;
        System.out.println(binarysearch(arr,k));



    }
    public static int binarysearch(int[] arr,int k){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(k<arr[mid]){
                end=mid-1;
            }
            else if(k>arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }
}
