package Solver;

public class BaseBoard {	
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
	
	//we checked inRow, inColumn, inBox methods. they work.
	//next step is to manipulate the board (add another dummy board), then solve.
}
