package Solver;

public class Constraints {
	//check if number x is in the row
	private static boolean inRow(int board[][], int row, int x)
	{
		for(int i = 0;i <= 8; i++){
			if(board[row][i] == x)
				return true;
		}
		return false;
	}
	//check if number x is in the column
	private static boolean inColumn(int board[][], int column, int x)
	{
		for(int i = 0; i <= 8; i ++){
			if(board[i][column] == x)
				return true;
		}
		return false;
	}
	//check if number x is in the 3x3 box
	private static boolean inBox(int board[][], int row, int column, int x)
	{
		int row2 =(row / 3) *3;
		int column2 = (column/3)*3;
		for(int i=row2; i<row2+3;i++){
			for(int j=column2;j<column2+3;j++){
				if(board[i][j] == x)
					return true;
			}
		}
		return false;
	}
	//check to see if all the Sudoku rules are met(number x not in column, row, and 3x3 box)
	private static boolean good(int b[][], int r, int c, int x){
		if(!inBox(b,r,c,x) && !inColumn(b,c,x) && !inRow(b,r,x))
			return true;
		return false;
	}
}

}
