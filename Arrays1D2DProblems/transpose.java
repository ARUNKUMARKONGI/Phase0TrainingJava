package Arrays1D2DProblems;

public class transpose {
    public static void main(String[] args) {
                // Example matrix
                int[][] originalMatrix = {
                    {1, 2},
                    {4, 5},
                    {7, 8}
                };
        
                // Transposing the matrix
                int[][] transposedMatrix = transpose1(originalMatrix);
        
                // Printing the transposed matrix
                System.out.println("Original Matrix:");
                printMatrix(originalMatrix);
                
                System.out.println("Transposed Matrix:");
                printMatrix(transposedMatrix);
            }
        
            public static int[][] transpose1(int[][] matrix) {
                int rows = matrix.length;
                int cols = matrix[0].length;
                int[][] transposed = new int[cols][rows];
        
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        transposed[j][i] = matrix[i][j];
                    }
                }
                
                return transposed;
            }
        
            public static void printMatrix(int[][] matrix) {
                for (int[] row : matrix) {
                    for (int value : row) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
            }
        }

        /* 
        {1, 2},
        {4, 5},  3*2 matrix
        {7, 8}

        after transpose becomes 2*3 matrix
        {1,4,7}
        {2,5,8}
         */