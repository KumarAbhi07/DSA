package Array2D;

public class SprialMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int c=0;
        int t=(maxr+1)*(maxc+1);
        while(c<t){
            //top wall
            for (int i = minr,j=minc; j <=maxc && c<t ; j++) {
                System.out.print(arr[i][j]+" ");
                c++;
            }
            minr++;
            //right wall
            for (int i =minr,j=maxc; i <=maxr && c<t; i++) {
                System.out.print(arr[i][j]+" ");
                c++;
            }
            maxc--;
            //bottom
            for (int i = maxr,j=maxc; j>=minc && c<t ; j--) {
                System.out.print(arr[i][j]+" ");
                c++;

            }
            maxr--;
            //left
            for (int i = maxr,j=minc; i >=minr && c<t; i--) {
                System.out.print(arr[i][j]+" ");
                c++;
            }
            minc++;
        }

    }

}
