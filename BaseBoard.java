package Solver;

public class BaseBoard {	
	public static void main(String[] args) {
	//our 9x9 sudoku board, 0's indicate empty spots
	int board[][] = new int[][]{
	{5,8,0,1,7,0,3,0,0},
	{0,0,9,0,0,8,0,1,0},
	{0,0,3,0,0,0,0,0,8},
	{4,0,6,8,0,7,0,0,5},
	{8,3,0,0,0,0,0,7,4},
	{2,0,0,6,0,5,8,0,3},
	{3,0,0,0,0,0,5,0,0},
	{0,6,0,5,0,0,2,0,0},
	{0,0,7,0,8,3,0,6,9}};
		
	}
	
	//we checked inRow, inColumn, inBox methods. they work.
	//next step is to manipulate the board (add another dummy board), then solve.
	
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
	//check to see if all the Sudoku rules are met(column, row, and 3x3 box)
	private static boolean good(int b[][], int r, int c, int x){
		if(!inBox(b,r,c,x) && !inColumn(b,c,x) && !inRow(b,r,x))
			return true;
		return false;
	}
}
