package Recursion_Revision;

public class fibonacciseries {
    public static int fibo(int n){
        if(n==0||n==1){
            return n;
        }
//        int fibonm1=fibo(n-1);
//        int fibonm2=fibo(n-2);
//        int fib=fibonm1+fibonm2;
//        return fib;
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n; i++) {
            System.out.println(fibo(i));

        }

    }
}
