package Array;

public class Pattern {
    public static void main(String[] args) {
        pattern11(5);

    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                System.out.print(("* "));

            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print(("* "));

            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=n-1;i>=0;i--){
            for (int j = 0; j <=i; j++) {
                System.out.print(("* "));

            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=0;i<n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print((j+" "));

            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        pattern2(n);
        pattern3(n-1);
    }
    static void pattern6(){
        int m=4;
        int n=5;
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==1||j==1||i==m||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();


        }}
    static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    static void pattern8(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = n; i >0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        int count=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

