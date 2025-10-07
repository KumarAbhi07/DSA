package Recursion_Revision;

public class Tiling_problem {
    public static int tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        //vertical
        int fnm1=tiling(n-1);
        //horizantal
        int fnm2=tiling(n-2);
        int totalway=fnm1+fnm2;
        return totalway;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(tiling(n));
    }
}
