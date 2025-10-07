package Backtracking;

public class nQueenCountSolution {
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
        System.out.println(count);

    }
    static int count=0;
    public static void nQueen(char [][] board,int row){
        if(row==board.length){
            count++;
            return;
        }
        for (int j = 0; j< board.length; j++) {
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board,row+1);
                board[row][j]='X';
            }

        }
    }
    public static boolean isSafe(char [][] board, int row, int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal up left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //diagonal up right
        for(int i=row -1,j=col+1;i>=0&&j<board[0].length;i--,j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
