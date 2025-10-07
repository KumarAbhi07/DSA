package DIvideConquer;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,3,1,2,2,2};
        System.out.println(majority(arr));
    }
    public static int countRange(int[] arr,int num,int start, int end){
        int count=0;
        for (int i = start; i <=end ; i++) {
            if(arr[i]==num){
                count++;
            }

        }
        return count;
    }
    private static int majorityElementrec(int[] nums, int lo, int hi){
        if(lo==hi){
            return nums[lo];
        }

        int mid=lo+(hi-lo)/2;
        int left=majorityElementrec(nums,lo,mid);
        int right=majorityElementrec(nums,mid+1,hi);

        if(left==right){
            return left;
        }
        int leftcount=countRange(nums,left,lo,hi);
        int rightcount=countRange(nums,right,lo,hi);

        return leftcount>rightcount?left:right;

    }
    public static int majority(int[] arr){
        return majorityElementrec(arr,0,arr.length-1);
    }


}
