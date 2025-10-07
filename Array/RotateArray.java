package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.print("number of rotation:");
        int k=sc.nextInt();
        System.out.print("Enter Rotation Direction(L:Left/R:Right):");
        String str=sc.next();
        char ch=str.charAt(0);
        if(ch=='L'||str.equals("Left")){
            Reverse(nums,0,nums.length-k-1);
            Reverse(nums,nums.length-k,nums.length-1);
            Reverse(nums,0,nums.length-1);
        }
        else if(ch=='R'||str.equals("Right")){
            Reverse(nums,0,k-1);
            Reverse(nums,k,nums.length-1);
            Reverse(nums,0,nums.length-1);

        }
        System.out.println(Arrays.toString(nums));

    }
    static void Reverse(int[] arr,int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
