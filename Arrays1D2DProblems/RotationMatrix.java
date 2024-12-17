package Arrays1D2DProblems;

public class RotationMatrix {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            /* {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} */
            {1,2},
            {4,3}
        }; 
        
        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) 
        {
            int left = 0, right = n - 1;
            while (left < right) 
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
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
*/