package Recursion_Revision;

public class Print_number {
    public static void printn(int n){
        if(n==0){
//            System.out.println(n);
            return;
        }

        printn(n-1);
        System.out.println(n);
    }


    public static void printRev(int n){
        if(n==0){
//            System.out.println(n);
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }
    public static void main(String[] args){
        int n=10;
        printRev(n);
        printn(n);

    }


}
