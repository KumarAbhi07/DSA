package Recursion_Revision;

public class primidpattern {

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");



    }

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){

            print(i);

        }
    }
}
