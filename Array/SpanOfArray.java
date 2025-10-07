package Array;

import java.util.Scanner ;
public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=Max(arr);
        int min=Min(arr);
        System.out.println(max-min);

    }
    static int Max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    static int Min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
}
