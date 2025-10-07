package Recursion_Revision;

public class printdec {
    public static void main(String[] args) {
        int n=30;
        printdes(n);
    }
    public static void printdes(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printdes(n-1);

    }
}
