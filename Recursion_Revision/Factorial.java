package Recursion_Revision;

public class Factorial {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));

    }
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        int factnm1=fact(n-1);
        int factn=n*factnm1;
        return factn;
    }
}
