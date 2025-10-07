package Backtracking;

public class GridWay {
    public static void main(String[] args) {
        int m=4;
        int n=4;
        System.out.println(gridway(0,0,m,n));
    }
    public static int gridway(int i, int j, int m, int n){
        if(i==m-1||j==n-1){
            return 1;
        }
        else if(i==m||j==n){
            return 0;
        }
        //right way
        int w1=gridway(i,j+1,m,n);
        // down way
        int w2=gridway(i+1,j,m,n);
        return w1+w2;
    }
}
