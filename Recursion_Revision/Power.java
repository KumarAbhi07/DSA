package Recursion_Revision;

public class Power {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int pownm1=pow(x,n-1);
        int pown=x*pownm1;
        return pown;
    }

    public static void main(String[] args) {
        int n=5;
        int x=2;
        System.out.println(pow(x,n));
    }
}
