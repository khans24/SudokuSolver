package Solver;

public class BaseBoard {
	private int board[][] ;

	//when baseboard object is created constructor creates the default board which is a 2d array.
	//our 9x9 sudoku board, 0's indicate empty spots
	public BaseBoard()
	{
		board = new int[9][9];
	}
	public BaseBoard(int x[][])
	{
		this.board = x;
	}
	public int[][] getBoard()
	{
		return this.board;
	}
	public void fillSpot(int n, int row, int column)
	{
		for(int i = 0; i <=row; i ++)
		{
			if (i == row)
			for (int j = 0; j <= column;j++)
			{
				if (j ==column)
					this.board[i][j] = n;
			}
		}
	}
	public void print()
	{
		for (int i = 0; i<board.length ; i ++)
		{
			System.out.println();
			if (i%3 ==0)
				System.out.println("------------------------");
			for(int j = 0; j< board[i].length; j++)
			{
				if(j%3==0)
					System.out.print("| ");
				System.out.printf(board[i][j]+ " ");
				
			}
		}
	}
	
	//we checked inRow, inColumn, inBox methods. they work.
	//next step is to manipulate the board (add another dummy board), then solve.
	
	//check if number x is in the row}
}
