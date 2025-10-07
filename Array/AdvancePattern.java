package Array;

public class AdvancePattern {
    public static void main(String[] args) {
        pattern5(6);
    }
    static void pattern1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        for (int i = n; i >0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    static void pattern2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");

            }
            System.out.println();

        }
    }
    static void pattern4(int n){
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
    static void pattern5(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n; i >=1 ; i--) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


