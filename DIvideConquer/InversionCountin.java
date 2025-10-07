package DIvideConquer;

public class InversionCountin {
    public static void main(String[] args) {
        int [] arr={2,4,1,3,5};
        System.out.println(mergeSort(arr,0,arr.length-1));
    }
    //brute force approach
//    public static int inversioncount(int[] arr){
//        int n=arr.length;
//        int count=0;
//        for (int i = 0; i < n-1; i++) {
//            for(int j=i+1;j<n;j++){
//                if(arr[i]>arr[j]){
//                    count++;
//                }
//            }
//
//        }
//        return count;
//    }
      public static int merge(int[] arr,int left,int mid, int right){
        int i=left;
        int j=mid;
        int invcount=0;

        int[] temp=new int[right-left+1];
        int k=0;

        while(i<mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;i++;

            }
            else{
                temp[k++]=arr[j++];
                invcount+=mid-i;
            }

        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];

        }
        for(i=left,k=0;i<=right;i++,k++){
            arr[i]=temp[k];
        }
        return invcount;
      }
      public static int mergeSort(int[] arr, int left, int right){
        int invcount=0;
        if(left<right){
            int mid=left+(right-left)/2;
            invcount+=mergeSort(arr,left,mid);
            invcount+=mergeSort(arr,mid+1,right);
            invcount+=merge(arr,left,mid+1,right);
        }
        return invcount;
      }
}
