package Solver;

public class Solve extends Constraints {
	public static void main(String[] args) 
	{
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
		BaseBoard x = new BaseBoard(board);	
		x.print();
		if(solved(x));
			x.print();
	}	
	public boolean solved(BaseBoard x)
		{
		int [][] board = x.getBoard();
			for (int i = 0; i <board.length;i++)
			{
				for (int j= 0; j< board[0].length ; j++)
				{
					if(x.getBoard()[i][j] == 0)
					{
						for(int k = 1; k <10; k++)
						{
							if(good(board, i, j, k))
							{
								x.fillSpot(k, i, j);
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
