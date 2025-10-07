package Array2D;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr={{1,23,5,6},{1,5,6,78},{33,56,7,8}};
        int s = 6;
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
                if(arr[i][j]==s){

                    System.out.println("("+i+","+j+")");
                    System.out.println(count);
                }
            }
        }
        
    }
    
}
