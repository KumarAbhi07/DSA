package Recursion_Revision;

public class Lastocc {
    public static int lastocc(int [] arr, int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int isfound=lastocc(arr,key,i+1);
        if(isfound==-1&&arr[i]==key){
            return i;
        }
        return isfound;

    }

    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,5,6,7,3,8,9,2,5,5,5,4,5,43,7,8};
        System.out.println(lastocc(arr,5,0));
    }
}
