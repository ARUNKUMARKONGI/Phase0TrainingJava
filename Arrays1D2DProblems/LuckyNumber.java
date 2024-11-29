package Arrays1D2DProblems;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {
            {15, 16, 17},
            {9, 11, 13},
            {15, 16, 17}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        int luckyNumber = -1; // Default value if no lucky number is found
        
        // Step 1: Find the minimum in each row and check if it's the maximum in its column
        for (int i = 0; i < m; i++) {
            int minRowIndex = 0;
            int minRowValue = matrix[i][0];
            
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minRowIndex = j;
                }
            }
            
            // Check if the found minimum is the maximum in its column
            boolean isMaxInColumn = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][minRowIndex] > minRowValue) {
                    isMaxInColumn = false;
                    break;
                }
            }
            
            if (isMaxInColumn) {
                luckyNumber = minRowValue;
                break; // Since only one lucky number exists, we can stop searching
            }
        }
        
        System.out.println(luckyNumber); 
    }
}

/* 
 * 1,2,3
 * 4,5,6
 * 15,16,17
 * 
 * 15 is the lucky number
 */