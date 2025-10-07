package Recursion_Revision;

public class fact {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
//        int factnm1=fact(n-1);
//        int factn=n*factnm1;
//        return factn;
        return n*fact(n-1);

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
