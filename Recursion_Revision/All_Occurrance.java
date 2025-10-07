package Recursion_Revision;

public class All_Occurrance {
    public static void alloccurance(int[] arr, int key,int idx ){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        alloccurance(arr,key,idx+1);
    }

    public static void main(String[] args) {
        int [] arr={3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        alloccurance(arr,key,0);
    }
}
