package Recursion_Revision;

public class Optimizedpower {
    public static int optpower(int a,int n){
        if(n==0){
            return 1;
        }
//        int hp=optpower(a,n/2)*optpower(a,n/2);
        int hp=optpower(a,n/2);
        int hps=hp*hp;
        if(n%2!=0){
            hps=a*hps;
        }
        return hps;
    }

    public static void main(String[] args) {
        int a=12;
        int n=5;
        System.out.println(optpower(a,n));
    }
}
