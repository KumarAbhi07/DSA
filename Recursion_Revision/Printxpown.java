package Recursion_Revision;

public class Printxpown {
    public static int powerself(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powernm1=powerself(x,n-1);
        int power=x*powernm1;
        return power;
    }
    public static void main(String[] args) {
        int x=6;
        int n=3;
        System.out.println(powerself(x,n));

    }
}
