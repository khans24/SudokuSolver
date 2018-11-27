package Solver;

public class BaseBoard {	
	public static void main(String[] args) {
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
	//int column, row= 8;

	//we checked inRow, inColumn, inBox methods. they work.
	}
	private static boolean inRow(int board[][], int row, int x)
	{
		for(int i = 0;i <= 8; i++){
			if(board[row][i] == x)
				return true;
		}
		return false;
	}
	private static boolean inColumn(int board[][], int column, int x)
	{
		for(int i = 0; i <= 8; i ++){
			if(board[i][column] == x)
				return true;
		}
		return false;
	}
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
//	private boolean good(int b[][], int r, int c, int x){
//		if(!inBox(b,r,c,x) && !inColumn(b,r,c,x) && !inRow(b,r,c,x))
//			return true;
//		else 
//			return false;
//	}
}
