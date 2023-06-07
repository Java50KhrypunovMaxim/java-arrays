package telran.array;

public class MatricesInt 
{
public static int[][] multiplyConstant(int constant, int matrix [][])
{
	
	for(int i = 0; matrix.length>i; i++)
	{
		for(int y = 0; y < matrix[i].length; y++)
		{
			matrix[i][y] *= constant;
		}
	}
	return matrix;
}

public static int [] getColumn(int [][] matrix, int column)
{
	int [] arrayColumn = new int[matrix.length];
	for(int i = 0; matrix.length>i; i++)
	{
		for(int y = 0; y < matrix[i].length; y++)
		{
			 arrayColumn [i] = matrix[i][column];
		}
	}
	return arrayColumn;
}
public static int [][] transpMatrix(int [][] matrix)
{
	int[][] transpMatrix = new int[matrix[0].length][matrix.length];
	for(int i = 0; matrix.length>i; i++)
	{
		for(int y = 0; y < matrix[i].length; y++)
		{
			transpMatrix[y][i] = matrix[i][y];
		}
	}
	return transpMatrix;
}



}
