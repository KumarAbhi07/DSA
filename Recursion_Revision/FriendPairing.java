package Recursion_Revision;

public class FriendPairing {
    public static int fpair(int n){
        if(n==1||n==2){
            return n;
        }
//        //choice
//        //single
//        int fnm1=fpair(n-1);
//        int fnm2=fpair(n-2);
//        int pairway=(n-1)*fnm2;
//        int totway=fnm1+pairway;
//
//        return totway;
        return fpair(n-1) + (n-1)*fpair(n-2);

    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(fpair(n));
    }
}
