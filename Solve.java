/*Sadia Khan and Dorothy Scheines
Artificial Intelligence Final Project
Sudoku Solver
12/10/2018
*/
package Solver;

public class Solve extends Constraints {
	public static void main(String[] args) 
	{
		//a medium difficulty board
		int [][]board = new int[][]{
			{5,8,0,1,7,0,3,0,0},
			{0,0,9,0,0,8,0,1,0},
			{0,0,3,0,0,0,0,0,8},
			{4,0,6,8,0,7,0,0,5},
			{8,3,0,0,0,0,0,7,4},
			{2,0,0,6,0,5,8,0,3},
			{3,0,0,0,0,0,5,0,0},
			{0,6,0,5,0,0,2,0,0},
			{0,0,7,0,8,3,0,6,9}};
		//create the board
		BaseBoard x = new BaseBoard(board);	
		//print the unsolved board
		System.out.println("Unsolved Board X:");
		x.print();
		//if the board is completely solved then print it
		if(solved(x)) {
			System.out.println("\n\nSolved Sudoku Board X:");
			x.print();
		}
		//extra board for a second test - Hard
		int [][]board2 = new int[][]{
			{0,0,0,0,0,4,3,7,0},
			{6,3,0,0,7,0,2,0,0},
			{0,0,0,8,6,0,0,0,0},
			{1,0,9,0,0,6,0,0,0},
			{0,0,4,0,0,0,9,0,0},
			{0,0,0,1,0,0,4,0,8},
			{0,0,0,0,4,7,0,0,0},
			{0,0,7,0,2,0,0,4,1},
			{0,2,8,9,0,0,0,0,0}};
		//create board
		BaseBoard y = new BaseBoard(board2);
		//print unsolved board
		System.out.println("\n\nUnsolved Board Y:");
		y.print();
		//if the board is completely solved then print it
		if(solved(y)) {
			System.out.println("\n\nSolved Sudoku Board Y:");
			y.print();
		}
	}
	//Function that solves the board. Uses backtracking(Depth-First Search)
	public static boolean solved(BaseBoard x)
		{
		//get the board
		int [][] board = x.getBoard();
			//row
			for (int i = 0; i <board.length;i++)
			{
				//column
				for (int j= 0; j< board[0].length ; j++)
				{
					//if the value in the slot is a zero then try to find the right value for it
					if(x.getBoard()[i][j] == 0)
					{
						//valid values k 1-9
						for(int k = 1; k <10; k++)
						{
							//check if constraints are met
							if(good(board, i, j, k))
							{
								x.fillSpot(k, i, j);
								//if the value k does not mess up the contraints then put it into the slot [i][j]
								if(solved(x))
								{
									return true;
								}
								else
								{
									x.fillSpot(0, i, j);
								}
							}	
						}return false;
					}
				}
			}return true;
		}
}

