package DIvideConquer;

public class SearchInRotatedSortedArray  {
    public static void main(String[] args) {
        int [] arr={8,9,10,1,2,3,4,5,6,7};
        int tar=7;
        System.out.println(search(arr,tar,0,arr.length-1));

    }
    public static int search(int arr[],int tar, int start,int end){
        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(arr[start]<=tar&&tar<arr[mid]){
                return  search(arr,tar,start,mid-1);
            }
            else{
                return search(arr,tar,mid+1,end);
            }
        }
        else{
            if(arr[mid]<tar&&tar<=arr[end]){
                return search(arr,tar, mid+1,end);

            }
            else{
                return search(arr,tar,start,mid-1);
            }
        }
    }
}
