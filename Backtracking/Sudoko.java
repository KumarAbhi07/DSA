package Backtracking;

public class Sudoko {
    public static void main(String[] args) {
        int sudoku[][]={{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},

                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},

                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(SudokuSolver(sudoku,0,0)){
            System.out.println("Solution exist");
            printsudoku(sudoku);
        }
        else{
            System.out.println("solution doesnot exist");
        }
    }
    public static boolean SudokuSolver(int[][] sudoku, int row, int col){
        if(row==9){
            return true;
        }

        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
            return SudokuSolver(sudoku,nextrow,nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(SudokuSolver(sudoku,nextrow,nextcol)){
                    return true;
                }
            }
            sudoku[row][col]=0;
        }
        return false;
    }
    public static boolean isSafe(int [][] sudoku, int row, int col, int digit){
        //colunmn
        for (int i = 0; i <=8 ; i++) {
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for (int j = 0; j <=8 ; j++) {
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //3x3 grid
        for(int i=sr;i<sr+3;i++){
            for (int j = sc; j <sc+3 ; j++) {
                if(sudoku[i][j]==digit){
                    return false;
                }

            }
        }
        return true;
    }
    public static void printsudoku(int [][] sudoku){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
}
