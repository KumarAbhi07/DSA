package Recursion_Revision;

public class NumberIntoWord {
    static String [] digits={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void PrintInWord(int n){
        if(n==0){
            return;
        }
        int last=n%10;
        PrintInWord(n/10);
        System.out.print(digits[last]+" ");

    }

    public static void main(String[] args) {
        int n=1926;
        PrintInWord(n);
    }
}
