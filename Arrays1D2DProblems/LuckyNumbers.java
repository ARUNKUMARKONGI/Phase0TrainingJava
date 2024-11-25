import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        
        int m = matrix.length;  
        int n = matrix[0].length; 
        
        // Step 1: Find the minimum in each row
        for (int i = 0; i < m; i++) {
            int minRowIndex = 0;
            int minRowValue = matrix[i][0];
            
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minRowIndex = j;
                }
            }
            
            // Step 2: Check if the found minimum is the maximum in its column
            boolean isMaxInColumn = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][minRowIndex] > minRowValue) {
                    isMaxInColumn = false;
                    break;
                }
            }
            
            if (isMaxInColumn) {
                luckyNumbers.add(minRowValue);
            }
        }
        return luckyNumbers;
    }
    
    public static void main(String[] args) {
        LuckyNumbers solution = new LuckyNumbers();
        
        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };
        
        List<Integer> result = solution.luckyNumbers(matrix);
        System.out.println(result); 
    }
}