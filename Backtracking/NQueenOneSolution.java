package Backtracking;

public class NQueenOneSolution {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';

            }
        }
        if(nQueen(board,0)){
            System.out.println("Solution is Possible");
            printboard(board);
        }
        else{
            System.out.println("Solution is not Possible");
        }


    }
    public static void printboard(char [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }
    }

    public static boolean nQueen(char board[][], int row){
        if(row==board.length){

            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueen(board,row+1)){
                    return true;

                }
                board[row][j]='X';


            }
        }
        return false;

    }
    public static boolean isSafe(char [][] board, int row, int col){
        //vertical up
        for (int i= row-1; i>=0;i--) {
            if(board[i][col]=='Q') {
                return false;
            }
        }
        //diagonal up left
        for (int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q') {
                return false;
            }

        }

        //diagonal upo right
        for (int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
