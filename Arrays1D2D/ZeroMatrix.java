import java.util.Scanner;

public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the dimensions of the matrix
        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(matrix, n);

        setZeroMatrix(matrix, n);

        System.out.println("Modified Matrix:");
        printMatrix(matrix, n);
        
        scanner.close();
    }

    private static void setZeroMatrix(int[][] matrix, int n) {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];

        // Step 1: Determine which rows and columns need to be zeroed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        // Step 2: Set the rows to zero
        for (int i = 0; i < n; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Step 3: Set the columns to zero
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
