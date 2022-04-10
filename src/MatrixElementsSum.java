public class MatrixElementsSum {
	/*
	  After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).

Example

For

matrix = [[0, 1, 1, 2], 
          [0, 5, 0, 0], 
          [2, 0, 3, 3]]
the output should be
matrixElementsSum(matrix) = 9.
	 */

	public static void main(String[] args) {

		int[][] matrix = { { 1, 1, 1, 0 }, 
		                   { 0, 5, 0, 1 }, 
		                   { 2, 1, 3, 10} };
		System.out.println(new MatrixElementsSum().matrixElementsSum(matrix));
	}
	int matrixElementsSum(int[][] matrix) {
		
		for (int i = 0; i < matrix.length - 1; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (matrix[i][j] == 0 ) {
					
					matrix[i + 1][j] = 0;
					
				}
			}
		}
		
		return sum(matrix);
	}

	int sum(int matrix[][]) {
		
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

}
