package Solver;

public class BaseBoard {	
	//our 9x9 sudoku board, 0's indicate empty spots
	
	//i wanted to instantiate the array in the class and then put in the values in a constructor 
	//with 2d arrays this doesn't really work however it seems to work just fine this way and manipulating
	//the board is completely possible as long as our methods are public 
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
	
	//we checked inRow, inColumn, inBox methods. they work.
	//next step is to manipulate the board (add another dummy board), then solve.
	public int[][] getBoard()
	{
		return this.board;
	}
	public void fillSpot(int n, int row, int column)
	{
		//this method will be used in solve to manipulate the board
		for(int i = 0; i <=row; i ++)
		{
			if (i == row)
			for (int j = 0; j <= column;j++)
			{
				if (j ==column)
					if(this.board[i][j]==0)
						this.board[i][j] = n;
					else
						System.out.printf("Error spot is filled.");
			}
		}
	}
	public void print()
	{
		//this method is just a nicer way to print
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
	
}
