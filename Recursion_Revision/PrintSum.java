package Recursion_Revision;

public class PrintSum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
//        int sumnm1=sum(n-1);
//        int sumn=n+sumnm1;
//        return sumn;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
