package Recursion_Revision;

public class fibonacci {

    public static void printfib(int a,int b,int n){
        if(n==0){
            System.out.println(a);
            System.out.println(b);
            return;
        }
        int c=a+b;

        System.out.println(c);
        printfib(b,c,n-1);

    }
    public static void main(String[] args) {
         int n=10;
         int a=0;
         int b=1;
        System.out.println(a);
        System.out.println(b);
        printfib(0,1,n-2);

    }
}
