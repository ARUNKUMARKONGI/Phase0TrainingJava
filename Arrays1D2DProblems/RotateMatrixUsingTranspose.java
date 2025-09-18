import java.util.*;

public class RotateMatrixUsingTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Read matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose into a new matrix
        int[][] transposed = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Step 2: Reverse each row (your snippet)
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = transposed[i][left];
                transposed[i][left] = transposed[i][right];
                transposed[i][right] = temp;
                left++;
                right--;
            }
        }

        // Output the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/* To rotate a 2D matrix (image) in place by 90 degrees clockwise, 
we can perform the following steps:
Transpose the Matrix:

The transpose of a matrix is obtained by swapping the rows with the columns. 
This turns the element at position (i,j) into position (j,i)​

1 4 7
2 5 8
3 6 9

After transposing, to complete the 90-degree rotation, reverse each row.
7 4 1
8 5 2
9 6 3

the below method is just for printing the rotated value
if the question is to rotate and update the array 

static void rotate(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }



    import java.util.Arrays;

public class MatrixRotation {

    public static void rotateMatrixClockwise(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return; // Handle empty or invalid matrices
        }

        int n = matrix.length; // Assuming a square matrix (n x n)

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start j from i+1 to avoid double-swapping
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateMatrixClockwise(matrix);

        System.out.println("\nMatrix after 90-degree clockwise rotation:");
        printMatrix(matrix);
    }
}
*/