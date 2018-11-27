package Solver;

public class BaseBoard {
	
	
	private int[][] fill(){		
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
		return board;
	}
	//add 2d array for boxes
	int [][] boxes = new int[3][3];

	private boolean inRow(int row, int x)
	{
		for(int i = 0; i < column; i ++){
		if(board[row][i] == x)
			return true;

		else
			return false;
	}
	}
	private boolean inColumn(int column, int x)
	{	
		for(int i = 0; i < row; i ++){
			if(board[i][column] == x)
				return true;
			else
				return false;
		}
	}
	private boolean inBox(int row, int column, int x)
	{

	}
}
