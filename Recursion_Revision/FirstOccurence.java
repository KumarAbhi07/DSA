package Recursion_Revision;

public class FirstOccurence {
    public static int firstocc(int arr[], int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstocc(arr,key,i+1);
    }

    public static void main(String[] args) {
        int arr[]={2,1,2,2,3,4,5,6,7,3,8,9};
        System.out.println(firstocc(arr,5,0));
    }

}
